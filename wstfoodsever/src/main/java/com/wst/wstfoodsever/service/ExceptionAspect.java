package com.wst.wstfoodsever.service;


import com.alibaba.fastjson.JSONObject;
import com.wst.wstfoodsever.dao.Product;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Aspect
public class ExceptionAspect {

    @Autowired
    private RedisTemplate redisTemplate;


    @Pointcut("@annotation(com.wst.wstfoodsever.service.ExceptionInspect)")
    public void anyMethod(){}//定义一个切入点


    @Around("anyMethod() && @annotation(exceptionInspect)")
    public Object doBasicProfiling(ProceedingJoinPoint pjp,ExceptionInspect exceptionInspect) throws Throwable {
        Object result = null;
        Object[] obj=  pjp.getArgs();
        try{
            Product pro = (Product) obj[0];
            String key = pro.getId() + exceptionInspect.id() ;
            boolean hasKey = redisTemplate.hasKey(key);
            System.out.println(obj[0].getClass().getTypeName()); //获取参数类型名称
            System.out.println(pjp.getSignature().getDeclaringTypeName());//获取类类型名称
            Class[] parameterTypes = ((MethodSignature)pjp.getSignature()).getMethod().getParameterTypes();//获取所有参数类型
            System.out.println(parameterTypes);

            ValueOperations<String,Object> operations = redisTemplate.opsForValue();
            if(!hasKey){
                result = pjp.proceed();
                System.out.println(exceptionInspect.id() + "： 执行结果放入缓存");
                operations.set(key,result,120, TimeUnit.SECONDS);
            }
            result = operations.get(key);
        }catch (RequestException e){
            System.out.println("进入异常处理--------");
            System.out.println(e.getMessage());
            System.out.println("入库------");

        }

        return result;
    }

}

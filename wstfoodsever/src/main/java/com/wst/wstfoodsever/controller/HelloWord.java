package com.wst.wstfoodsever.controller;


import com.alibaba.fastjson.JSONObject;
import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.dao.Product;
import com.wst.wstfoodsever.mapper.DocumentMapper;
import com.wst.wstfoodsever.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@RestController
public class HelloWord {

    @Resource
    DocumentMapper documentMapper;

    @RequestMapping("/test")
    public void test(String p) throws Exception {

        String str= "com.wst.wstfoodsever.dao.Product";
        String[] ss = str.split(",");
        Object obj = ApplicationContextUtils.getBean("productService");
//        Object obj = Class.forName("com.wst.wstfoodsever.service.ProductServiceImpl").newInstance();
        Class<?> cls =obj.getClass();
        Class[] parameterTypes = new Class[ss.length];
        parameterTypes[0] = Product.class;

        Method clearMethod =  cls.getDeclaredMethod("testAop",parameterTypes);
        Product product=new Product();
        product.setId(112);
        product.setTypeid(111);
        product.setContent("hahaha");
        Object[] objects = new Object[1];
        objects[0] = product;
        String ssss = JSONObject.toJSONString(objects);
        Object scrVal =  clearMethod.invoke(obj,objects);
        System.out.println(scrVal);
    }



    @RequestMapping("/query") //
    public String query(){
        Document document = documentMapper.selectByPrimaryKey(1);
        return "dsadas";
    }
}

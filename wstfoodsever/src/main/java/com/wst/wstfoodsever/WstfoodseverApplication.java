package com.wst.wstfoodsever;

import com.wst.wstfoodsever.controller.ApplicationContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// mapper 接口类扫描包配置xxx
@MapperScan("com.wst.wstfoodsever.mapper")
public class WstfoodseverApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(WstfoodseverApplication.class, args);
        ApplicationContextUtils.setContext(applicationContext);
//        SpringApplication.run(WstfoodseverApplication.class, args);
    }

}

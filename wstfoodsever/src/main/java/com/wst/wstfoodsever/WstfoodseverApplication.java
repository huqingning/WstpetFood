package com.wst.wstfoodsever;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.wst.wstfoodsever.mapper")
public class WstfoodseverApplication {

    public static void main(String[] args) {
        SpringApplication.run(WstfoodseverApplication.class, args);
    }

}

package com.wst.wstfoodsever;

import com.alibaba.fastjson.JSONObject;
import com.wst.wstfoodsever.controller.ApplicationContextUtils;
import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.dao.Product;
import com.wst.wstfoodsever.mapper.DocumentMapper;
import com.wst.wstfoodsever.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@SpringBootTest
class WstfoodseverApplicationTests {
    @Resource
    ProductService productService;


    @Test
    void contextLoads() {
        Product product=new Product();
        product.setId(112);
        product.setTypeid(111);
        product.setContent("hahaha");
//
//        productService.testAop(product);
//        productService.testAop1(product);
//        productService.testAop2(product);

//       boolean a =  productService.testAop(product);
//        System.out.println(a);
//       if(a){
//           boolean b = productService.testAop1(product);
//           if(b){
//               productService.testAop2(product);
//           }
//       }
    }

    @Test
    public void applicationTest() throws Exception {
        String ss = "com.wst.wstfoodsever.service.ProductService";
        System.out.println(ss.substring(ss.lastIndexOf(".") + 1));

    }

    public static void main(String[] args) {
        Product product=new Product();
        System.out.println(product.getClass().getTypeName());
    }

}

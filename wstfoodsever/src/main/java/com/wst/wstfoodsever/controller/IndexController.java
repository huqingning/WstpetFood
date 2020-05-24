package com.wst.wstfoodsever.controller;

import com.alibaba.fastjson.JSONObject;
import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController("api/")
public class IndexController extends BaseController{

    @Autowired
    ProductService productService;

    @PostMapping("index")
    public void index(HttpServletResponse response){
        List<Document> result =  productService.indexInfo();
        writeResponse(response, JSONObject.toJSONString(result));
    }




}

package com.wst.wstfoodsever.controller;

import com.alibaba.fastjson.JSONObject;
import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("api/")
public class IndexController extends BaseController{

    @Autowired
    ProductService productService;

    @RequestMapping("index")
    public void index(HttpServletResponse response){
        List<Document> data =  productService.indexInfo();
        writeResponse(response, RtnUtil.getRtnMsgAndData(ErrorCode.SUCESS,ErrorCode.getMsg(ErrorCode.SUCESS),data));
    }




}

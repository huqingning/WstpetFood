package com.wst.wstfoodsever.controller;

import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.mapper.DocumentMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWord {

    @Resource
    DocumentMapper documentMapper;

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello world");
    }

    @RequestMapping("/query")
    public String query(){
        Document document = documentMapper.selectByPrimaryKey(1);
        return "dsadas";
    }
}

package com.wst.wstfoodsever.controller;

import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public abstract class BaseController {

    /**
     * 返回数据流
     * @param response
     * @param resp
     * @throws Exception
     */
    public void writeResponse(HttpServletResponse response, String resp){
        PrintWriter writer = null;
        try {
            response.setContentType("text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            writer = response.getWriter();
            writer.write(resp);
            writer.flush();
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error("response error");
        } finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}

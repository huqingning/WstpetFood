package com.wst.wstfoodsever.controller;

import com.alibaba.fastjson.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 接口请求返回数据
 */
public class RtnUtil {
    public static String getRtnMsgAndData(int rtn, String rtnMsg, Object data) {
        Map<String, Object> object = new LinkedHashMap<String, Object>(3);
        object.put("code", rtn);
        object.put("rtnMsg", rtnMsg);
        object.put("data", data);
        return JSONObject.toJSONString(object);
    }
}

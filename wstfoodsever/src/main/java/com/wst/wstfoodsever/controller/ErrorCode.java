package com.wst.wstfoodsever.controller;

import java.util.HashMap;
import java.util.Map;

public class ErrorCode {

   public static final  int SUCESS = 00;
   public static final  int FAILD = 01;//


    public static final Map<Integer, String> msg = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -4522350331176616723L;
        {
            this.put(SUCESS,"成功");
            this.put(FAILD,"失败");
        }
    };

    public static final String getMsg(int ErroCode){
        return msg.get(new Integer(ErroCode));
    }

}

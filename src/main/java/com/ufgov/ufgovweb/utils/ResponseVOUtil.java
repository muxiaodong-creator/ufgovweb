package com.ufgov.ufgovweb.utils;

import com.ufgov.ufgovweb.vo.Response;

/**
 * program: ufgovweb
 * <p>
 * description
 * <p>
 * author: muxd
 * <p>
 * create: 2020-03-22 20:07
 **/
public class ResponseVOUtil {
    public static Response sucess(Object object){
        Response response = new Response();
        response.setData(object);
        response.setCode(0);
        response.setMsg("成功");
        return response;
    }
    public static  Response success(){
        return  sucess(null);
    }

    public static  Response error(Integer code,String msg){
        Response response = new Response();
        response.setCode(code);
        response.setMsg(msg);
        return  response;

    }
}

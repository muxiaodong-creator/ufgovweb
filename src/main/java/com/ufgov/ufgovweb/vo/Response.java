package com.ufgov.ufgovweb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * program: ufgovweb
 * <p>
 * 通用相应对象
 * <p>
 * author: muxd
 * <p>
 * create: 2020-03-22 20:04
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    /** 错误码，正确返回 0 */
    private Integer code = 0;

    /** 错误信息，正确返回空字符串 */
    private String msg = "";

    /** 返回值对象 */
    private Object data;

    /**
     * 正确的相应构造函数
     * @param data
     */
    public Response(Object data){
        this.data = data;
    }

}

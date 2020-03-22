package com.ufgov.ufgovweb.constant;

import lombok.Getter;

/**
 * program: ufgovweb
 * <p>
 * description
 * <p>
 * author: muxd
 * <p>
 * create: 2020-03-22 20:13
 **/
@Getter
public enum ResultEnum {
    SUCCESS(0,""),
    PARAM_ERROR(1, "参数不正确")
    ;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;


}

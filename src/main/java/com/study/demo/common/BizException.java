package com.study.demo.common;

import lombok.Data;

@Data
public class BizException extends RuntimeException {
    private Integer code;
    private String message;

    public BizException(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}

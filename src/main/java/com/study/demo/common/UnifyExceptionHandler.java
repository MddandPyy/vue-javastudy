package com.study.demo.common;

import com.study.demo.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class UnifyExceptionHandler {

    @ExceptionHandler(BizException.class)
    @ResponseBody
    public Result handlerBizException(BizException e){
        Result result = new Result();
        result.setFlag(false);
        result.setCode(e.getCode());
        result.setMsg(e.getMessage());
        return result;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handlerException(Exception e){
        Result result = new Result();
        result.setFlag(false);
        result.setCode(1000);
        result.setMsg("未知异常");
        return result;
    }
}

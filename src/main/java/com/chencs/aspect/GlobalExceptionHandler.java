package com.chencs.aspect;

import com.chencs.vo.Error;
import com.chencs.vo.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 *
 * @author: chencs
 * @date: 2018/5/15
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handle(HttpServletRequest request, Exception e) {
        log.error("Other Exception", e);

        return new ResultBean(Error.UNKNOWN_REASON);
    }

}

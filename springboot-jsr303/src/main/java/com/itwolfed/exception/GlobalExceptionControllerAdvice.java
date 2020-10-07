package com.itwolfed.exception;

import com.itwolfed.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.ruize.ddd.core.gateway.ohs.ExceptionControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.itwolfed.controller")
public class GlobalExceptionControllerAdvice extends com.ruize.ddd.core.gateway.ohs.ExceptionControllerAdvice {


}

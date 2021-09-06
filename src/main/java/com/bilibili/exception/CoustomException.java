package com.bilibili.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FAILED_DEPENDENCY, reason = "用户太多异常")
public class CoustomException extends RuntimeException {
    public CoustomException() {

    }

    public CoustomException(String message) {
        super(message);
    }
}

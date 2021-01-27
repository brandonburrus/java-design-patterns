package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.handler;

import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.HttpException;

public interface HttpExceptionHandler {

    boolean handle(HttpException exception);
}

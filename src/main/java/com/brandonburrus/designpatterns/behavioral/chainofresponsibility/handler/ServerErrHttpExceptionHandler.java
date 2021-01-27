package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.handler;

import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.HttpException;
import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.ServerErrHttpException;

public class ServerErrHttpExceptionHandler implements HttpExceptionHandler {
    @Override
    public boolean handle(HttpException exception) {
        if (exception instanceof ServerErrHttpException) {
            System.out.println("Handled 500 err!");
            return true;
        }
        return false;
    }
}

package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.handler;

import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.HttpException;
import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.NotAuthorizedHttpException;

public class NotAuthorizedHttpExceptionHandler implements HttpExceptionHandler {
    @Override
    public boolean handle(HttpException exception) {
        if (exception instanceof NotAuthorizedHttpException) {
            System.out.println("Unauthorized err was handled!");
            return true;
        }
        return false;
    }
}

package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.handler;

import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.HttpException;
import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.NotFoundHttpException;

public class NotFoundHttpExceptionHandler implements HttpExceptionHandler {
    @Override
    public boolean handle(HttpException exception) {
        if (exception instanceof NotFoundHttpException) {
            System.out.println("Handled 404 err!");
            return true;
        }
        return false;
    }
}

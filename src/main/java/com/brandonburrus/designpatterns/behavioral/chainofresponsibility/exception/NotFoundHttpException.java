package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception;

public class NotFoundHttpException extends HttpException {
    @Override
    int getStatusCode() {
        return 404;
    }
}

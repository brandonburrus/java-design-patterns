package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception;

public class NotAuthorizedHttpException extends HttpException {
    @Override
    int getStatusCode() {
        return 401;
    }
}

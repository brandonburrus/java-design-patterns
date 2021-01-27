package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception;

public class ServerErrHttpException extends HttpException {
    @Override
    int getStatusCode() {
        return 500;
    }
}

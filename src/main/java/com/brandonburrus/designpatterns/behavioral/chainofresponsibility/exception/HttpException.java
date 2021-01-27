package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception;

public abstract class HttpException extends Exception {
    abstract int getStatusCode();
}

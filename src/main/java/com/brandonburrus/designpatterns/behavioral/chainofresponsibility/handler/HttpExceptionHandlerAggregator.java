package com.brandonburrus.designpatterns.behavioral.chainofresponsibility.handler;

import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.HttpException;

import java.util.ArrayList;
import java.util.List;

public class HttpExceptionHandlerAggregator implements HttpExceptionHandler {

    private final List<HttpExceptionHandler> handlers;

    public HttpExceptionHandlerAggregator() {
        this.handlers = new ArrayList<>();
    }

    public HttpExceptionHandlerAggregator withHandler(HttpExceptionHandler handler) {
        handlers.add(handler);
        return this;
    }

    @Override
    public boolean handle(HttpException exception) {
        for (HttpExceptionHandler handler : handlers) {
            boolean didHandle = handler.handle(exception);
            if (didHandle) {
                return true;
            }
        }
        return false;
    }
}

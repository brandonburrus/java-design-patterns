package com.brandonburrus.designpatterns.behavioral.chainofresponsibility;

import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.HttpException;
import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.exception.ServerErrHttpException;
import com.brandonburrus.designpatterns.behavioral.chainofresponsibility.handler.*;

public class ChainOfResponsibilityApp {

    public static void main(String[] args) {
        HttpExceptionHandler handler = new HttpExceptionHandlerAggregator()
            .withHandler(new NotAuthorizedHttpExceptionHandler())
            .withHandler(new NotFoundHttpExceptionHandler())
            .withHandler(new ServerErrHttpExceptionHandler());

        try {
            throw new ServerErrHttpException();
        } catch (HttpException e) {
            if (handler.handle(e)) {
                System.out.println("Http exception was handled!");
            } else {
                e.printStackTrace();
            }
        }
    }
}

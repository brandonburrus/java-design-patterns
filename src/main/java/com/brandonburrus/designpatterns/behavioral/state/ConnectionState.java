package com.brandonburrus.designpatterns.behavioral.state;

public interface ConnectionState {
    void open() throws Exception;
    void close() throws Exception;
    void ping() throws Exception;
}

package com.brandonburrus.designpatterns.behavioral.state;

public class OpenableConnectionState implements ConnectionState {

    private Connection parentConnection;

    public OpenableConnectionState(Connection parentConnection) {
        this.parentConnection = parentConnection;
    }

    @Override
    public void open() {
        parentConnection.setState(new ListeningConnectionState(parentConnection));
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Unable to close a connection that hasn't been opened!");
    }

    @Override
    public void ping() throws Exception {
        throw new Exception("Unable to ping an unopened connection");
    }
}

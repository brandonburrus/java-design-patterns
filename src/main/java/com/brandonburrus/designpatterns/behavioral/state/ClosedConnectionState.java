package com.brandonburrus.designpatterns.behavioral.state;

public class ClosedConnectionState implements ConnectionState {

    private Connection parentConnection;

    public ClosedConnectionState(Connection parentConnection) {
        this.parentConnection = parentConnection;
    }

    @Override
    public void open() {
        parentConnection.setState(new ListeningConnectionState(parentConnection));
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Connection is already closed");
    }

    @Override
    public void ping() throws Exception {
        throw new Exception("Unable to ping a closed connection");
    }
}

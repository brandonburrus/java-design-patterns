package com.brandonburrus.designpatterns.behavioral.state;

public class ListeningConnectionState implements ConnectionState {

    private final Connection parentConnection;

    public ListeningConnectionState(Connection parentConnection) {
        this.parentConnection = parentConnection;
    }

    @Override
    public void open() throws Exception {
        throw new Exception("Connection is already open");
    }

    @Override
    public void close() {
        parentConnection.setState(new ClosedConnectionState(parentConnection));
    }

    @Override
    public void ping() {
        System.out.println("Connection is open!");
    }
}

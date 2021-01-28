package com.brandonburrus.designpatterns.behavioral.state;

public class Connection {

    private ConnectionState state;

    public Connection() {
        state = new OpenableConnectionState(this);
    }

    public ConnectionState getState() {
        return state;
    }

    public void setState(ConnectionState state) {
        this.state = state;
    }

    public void open() throws Exception {
        state.open();
    }

    public void close() throws Exception {
        state.close();
    }

    public void ping() throws Exception {
        state.ping();
    }
}

package com.brandonburrus.designpatterns.behavioral.memento;

import java.util.Stack;

public class MementoApp {

    private static final Stack<Counter.Snapshot> undoHistory;
    private static final Stack<Counter.Snapshot> redoHistory;
    private static final Counter counter;

    static {
        undoHistory = new Stack<>();
        redoHistory = new Stack<>();
        counter = new Counter()
            .onChange(undoHistory::push)
            .onChange(snapshot -> redoHistory.clear());
    }

    private static void undo() {
        if (undoHistory.size() > 1) {
            Counter.Snapshot snapshot = undoHistory.pop();
            counter.setFromSnapshot(undoHistory.peek());
            redoHistory.push(snapshot);
        } else if (!undoHistory.isEmpty()) {
            Counter.Snapshot lastSnapshot = undoHistory.pop();
            counter.setCount(0);
            redoHistory.push(lastSnapshot);
        }
    }

    private static void redo() {
        if (redoHistory.isEmpty()) {
            return;
        }

        Counter.Snapshot snapshot = redoHistory.pop();
        counter.setFromSnapshot(snapshot);
        undoHistory.push(snapshot);
    }

    public static void main(String[] args) {
        counter.increment();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());
        undo();
        System.out.println(counter.getCount());
        undo();
        System.out.println(counter.getCount());
        undo();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());
        undo();
        System.out.println(counter.getCount());
        redo();
        System.out.println(counter.getCount());
        counter.decrementBy(1);
        System.out.println(counter.getCount());
    }
}

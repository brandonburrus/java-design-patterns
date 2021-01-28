package com.brandonburrus.designpatterns.behavioral.memento;

import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Counter {

    public static class Snapshot implements Serializable {

        private final long value;

        public Snapshot(long value) {
            this.value = value;
        }

        public long getSnapshotValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Snapshot snapshot = (Snapshot) o;
            return value == snapshot.value;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(value);
        }
    }

    private final List<Consumer<Snapshot>> onChangedListeners;
    private long count;

    public Counter(long count) {
        this.onChangedListeners = new ArrayList<>();
        this.count = count;
    }

    public Counter() {
        this(0);
    }

    public static Counter fromSnapshot(Snapshot snapshot) {
        return new Counter(snapshot.getSnapshotValue());
    }

    public Counter onChange(Consumer<Snapshot> consumer) {
        this.onChangedListeners.add(consumer);
        return this;
    }

    private void createSnapshot() {
        for (Consumer<Snapshot> consumer : onChangedListeners) {
            consumer.accept(this.getSnapshot());
        }
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
        createSnapshot();
    }

    public void incrementBy(long amount) {
        this.count += amount;
        createSnapshot();
    }

    public void increment() {
        incrementBy(1);
    }

    public void decrementBy(long amount) {
        this.count -= amount;
        createSnapshot();
    }

    public void decrement() {
        decrementBy(1);
    }

    public void setFromSnapshot(Snapshot snapshot) {
        if (snapshot.getSnapshotValue() != this.getCount()) {
            this.count = snapshot.getSnapshotValue();
        }
    }

    public Snapshot getSnapshot() {
        return new Snapshot(this.getCount());
    }
}

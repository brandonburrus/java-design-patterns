package com.brandonburrus.designpatterns.behavioral.iterator;

import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;

import static com.google.common.base.MoreObjects.toStringHelper;

public class Tree<T extends Serializable> implements Serializable, Iterable<T> {

    public class Node implements Serializable {
        private T nodeValue;

        public Node(T nodeValue) {
            this.nodeValue = nodeValue;
        }

        public T getNodeValue() {
            return nodeValue;
        }

        public void setNodeValue(T node) {
            this.nodeValue = node;
        }

        @Override
        public String toString() {
            return toStringHelper(this)
                .add("value", nodeValue)
                .toString();
        }
    }

    private Node leftNode;
    private Node rightNode;

    public Tree() {
        this.leftNode = null;
        this.rightNode = null;
    }

    public Tree(T leftNode, T rightNode) {
        this.leftNode = new Node(leftNode);
        this.rightNode = new Node(rightNode);
    }

    public Tree(Node leftNode, Node rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Optional<Node> getLeftNode() {
        if (leftNode != null) {
            return Optional.of(leftNode);
        }
        return Optional.empty();
    }

    public Optional<Node> getRightNode() {
        if (rightNode != null) {
            return Optional.of(rightNode);
        }
        return Optional.empty();
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void setLeftNode(T leftNodeValue) {
        this.leftNode = new Node(leftNodeValue);
    }

    public void setRightNode(T rightNodeValue) {
        this.rightNode = new Node(rightNodeValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree<?> tree = (Tree<?>) o;
        return Objects.equal(leftNode, tree.leftNode) && Objects.equal(rightNode, tree.rightNode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(leftNode, rightNode);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("leftNode", this.leftNode)
            .add("rightNode", this.rightNode)
            .toString();
    }

    @Override
    public Iterator<T> iterator() {
        Stack<T> iterable = new Stack<>();
        traverse(iterable::push);
        return iterable.iterator();
    }

    public void traverse(Consumer<T> consumer) {
        if (leftNode.getNodeValue() instanceof Tree) {
            ((Tree<T>) leftNode.getNodeValue()).traverse(consumer);
        } else {
            consumer.accept(leftNode.getNodeValue());
        }
        if (rightNode.getNodeValue() instanceof Tree) {
            ((Tree<T>) rightNode.getNodeValue()).traverse(consumer);
        } else {
            consumer.accept(rightNode.getNodeValue());
        }
    }
}

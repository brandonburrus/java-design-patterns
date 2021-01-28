package com.brandonburrus.designpatterns.behavioral.iterator;

public class IteratorApp {

    public static void main(String[] args) {
        Tree<Integer> nums = new Tree<>();
        nums.setLeftNode(1);
        nums.setRightNode(2);

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}

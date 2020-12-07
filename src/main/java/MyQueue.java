package com.mynodetest;

public class MyQueue {

    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enque(MyNode newNode) {
        myLinkedList.append(newNode);
    }

    public void printMyNode() {
        myLinkedList.printMyNodes();
    }
}

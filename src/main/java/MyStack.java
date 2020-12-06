package com.mynodetest;

public class MyStack {

	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printMyNode() {
		myLinkedList.printMyNodes();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void clear() {
		while(myLinkedList.head != null) {
			myLinkedList.printMyNodes();
			myLinkedList.pop();
		}
	}

	public boolean isEmpty() {
		return (myLinkedList.head == null);
	}
}

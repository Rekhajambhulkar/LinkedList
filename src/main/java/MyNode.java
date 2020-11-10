package com.mynodetest;

public class MyNode<K> {

	private K Key;
	private MyNode next;

	public MyNode(K key) {
		this.Key = key;
		this.next = null;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
}

package com.mynodetest;

public class MyNode<K> implements INode<K> {

	private K Key;
	private MyNode next;

	public MyNode(K key) {
		this.Key = key;
		this.next = null;
	}

	@Override
	public K getKey() {
		return Key;
	}

	@Override
	public void setKey(K key) {
		this.next = (MyNode<K>) next;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
}

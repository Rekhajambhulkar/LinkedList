package com.mynodetest;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	//Function for adding the nodes at front
	public void add(INode newNode) {
		if(this.tail == null) {
		this.tail = newNode;

	}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	//Function for append the nodes at end
	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	//Function for Insert Node in middle
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	//Function for pop FirstNode
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	//Function for search the secondNode
	public INode search(INode newNodeToSearch) {
		INode tempNode = this.head;
		while(!tempNode.getNext().equals(newNodeToSearch)) {
			tempNode = tempNode.getNext();
		}
		tempNode = tempNode.getNext();
		return tempNode;
	}

	//Function for InsertNode after specified Node
	public boolean insertNodeAfterSpecifiedNode(INode insertionNode, INode specifiedNode) {
		INode tempNode = this.head;
		while(!tempNode.equals(specifiedNode)) {
			tempNode = tempNode.getNext();
		}
		INode nextNode = tempNode.getNext();
		tempNode.setNext(insertionNode);
		insertionNode.setNext(nextNode);

		return (tempNode.equals(specifiedNode) && specifiedNode.getNext().equals(insertionNode));
	}

	public void deleteNodeAfterSpecifiedNode(INode deleteNoad, MyNode specifiedNode) {
		INode tempNode = this.head;
		while(!tempNode.equals(specifiedNode)) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(this.tail);
	}

	//Function for print all the nodes
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes:");
		INode tempNode = head;
		while(tempNode.getNext() != null){
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
			}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	//Function for printFirstNodes
	public void printMyNodesFirstTwoNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes:");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		System.out.println(myNodes);
	}
}

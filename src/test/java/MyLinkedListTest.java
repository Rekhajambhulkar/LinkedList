package com.mynodetest;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	//Test case for adding 3 elements in LinkedList
	@Test
	public void givem3NumbersWhenLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	//Test case for append the element at end
	@Test
	public void givem3NumbersWhenLinkedListShouldBeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	//Test case for insert element in middle
	@Test
	public void insertNumbertinMiddle() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	//Test case for delete the firstNode
	@Test
	public void deleteFirstNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	// Test case for delete the LastNode
	@Test
	public void deleteLastNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.popLast();
		myLinkedList.printMyNodesFirstTwoNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	// Test Case for Search SecondNode
	@Test
	public void shouldPassThisTestANodeIfPresentLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		INode result = myLinkedList.search(mySecondNode);
		System.out.print("Search - ");
		myLinkedList.printMyNodes();
		Assert.assertEquals(mySecondNode, result);
	}
}

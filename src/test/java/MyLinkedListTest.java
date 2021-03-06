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

	@Test
	//Inserting a Node after Particular Node
	public void shouldPassThisTestWhenOneValueInsertedAfterSpecifiedValueLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> insertionNode = new MyNode<>(40);

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		boolean result = myLinkedList.insertNodeAfterSpecifiedNode(insertionNode, mySecondNode);
		System.out.print("Insert After\t- ");
		myLinkedList.printMyNodes();
		Assert.assertTrue(result);
	}

	@Test
	//Deleting Node after Particular Node
	public void shouldPassThisTestWhenSpecifiedNodeIsDeletedLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myForthNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myForthNode);

		myLinkedList.deleteNodeAfterSpecifiedNode(myThirdNode, mySecondNode);
		System.out.print("Delete After\t- ");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.getNext().getNext().equals(myForthNode);
		Assert.assertTrue(result);
	}

	@Test
	//Sorting Node after Particular Node
	public void shouldPassThisTestWhenThisOrderedListSorted() {

		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(40);
		MyNode<Integer> fourthNode = new MyNode<>(70);

		OrderList<Integer> orderedList = new OrderList<>();

		orderedList.add(firstNode);
		orderedList.add(secondNode);
		orderedList.add(thirdNode);
		orderedList.add(fourthNode);
		System.out.print("Sorting\t\t- ");
		orderedList.printNodes();
		boolean result = orderedList.head.equals(secondNode) &&
				orderedList.head.getNext().equals(thirdNode) &&
				orderedList.head.getNext().getNext().equals(firstNode) &&
				orderedList.tail.equals(fourthNode);
		Assert.assertTrue(result);
	}
}

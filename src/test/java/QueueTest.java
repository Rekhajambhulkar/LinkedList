@Test
    public void given3NumbersAddedToStackAndLastAddedNodeShouldBePeek() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();
        myQueue.enque(myFirstNode);
        myQueue.enque(mySecondNode);
        myQueue.enque(myThirdNode);

        myQueue.printMyNode();
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}

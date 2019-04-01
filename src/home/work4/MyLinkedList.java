package home.work4;

import javax.xml.soap.Node;

public class MyLinkedList<T> implements MyList<T> {
    MyNode<T> firstNode;
    MyNode<T> lastNode;
    int size = 0;

    public void MyLinkedList() {
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException
                    ("Your index: " + index + " bigger than List size: " + size);
    }

    @Override
    public void add(T value) {
        MyNode currentNode = lastNode;
        MyNode newNode = new MyNode(currentNode, value, null);
        lastNode = newNode;
        if (currentNode == null) {
            firstNode = newNode;
        } else {
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public void add(T value, int index) {
        checkIndex(index);
        if (index == size) {
            add(value);
        } else {
            MyNode NodeInIndex = firstNode;
            for (int i = 0; i < index; i++) {
                NodeInIndex = NodeInIndex.next;
            }
            MyNode previousNode = NodeInIndex.previous;
            MyNode currentNode = new MyNode(previousNode, value, NodeInIndex);
            if (previousNode == null) {
                firstNode = currentNode;
                currentNode.next.previous = currentNode;
                size++;
            } else {
                previousNode.next = currentNode;
                size++;
            }
        }
    }

    @Override
    public void addAll(MyList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        MyNode<T> desiredNode = firstNode;
        for (int i = 0; i < index; i++) {
            desiredNode = desiredNode.next;
        }
        return desiredNode.value;
    }

    @Override
    public void set(T value, int index) {
        checkIndex(index);
        if (index == size) {
            lastNode.value = value;
        } else {
            MyNode NodeInIndex = firstNode;
            for (int i = 0; i < index; i++) {
                NodeInIndex = NodeInIndex.next;
            }
            NodeInIndex.value = value;
        }
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        MyNode<T> NodeInIndex = firstNode;
        for (int i = 0; i < index; i++) {
            NodeInIndex = NodeInIndex.next;
        }
        if (NodeInIndex.previous == null) {
            firstNode = NodeInIndex.next;
            NodeInIndex.next.previous = null;
            NodeInIndex.next = null;
            size--;
        } else if (NodeInIndex.next == null) {
            lastNode = NodeInIndex.previous;
            NodeInIndex.previous.next = null;
            NodeInIndex.previous = null;
            size--;
        } else {
            NodeInIndex.previous.next = NodeInIndex.next;
            NodeInIndex.next.previous = NodeInIndex.previous;
            NodeInIndex.next = null;
            NodeInIndex.previous = null;
            size--;
        }
        return NodeInIndex.value;
    }

    @Override
    public T remove(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(get(i))) {
                return remove(i);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0 ? true : false;
    }

    @Override
    public String toString() {
        MyNode<T> currentNode = firstNode;
        StringBuilder result = new StringBuilder(currentNode.value.toString());
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            result.append(", ").append(currentNode.value.toString());
        }
        return result.toString();
    }
}

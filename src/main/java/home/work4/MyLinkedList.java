package home.work4;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> firstNode;
    private MyNode<T> lastNode;
    private int size = 0;

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException
                    ("Your index: " + index + " bigger than List size: " + size);
    }

    private MyNode<T> getNode(int index) {
        MyNode NodeInIndex = firstNode;
        for (int i = 0; i < index; i++) {
            NodeInIndex = NodeInIndex.next;
        }
        return NodeInIndex;
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
            MyNode NodeInIndex = getNode(index);
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
        MyNode<T> desiredNode = getNode(index);
        return desiredNode.value;
    }

    @Override
    public void set(T value, int index) {
        checkIndex(index);
        if (index == size) {
            lastNode.value = value;
        } else {
            MyNode NodeInIndex = getNode(index);
            NodeInIndex.value = value;
        }
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        MyNode<T> NodeInIndex = getNode(index);
        if (NodeInIndex.previous == null && NodeInIndex.next == null) {
            firstNode = null;
            lastNode = null;
            size--;
        } else if (NodeInIndex.previous == null) {
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
        return size == 0;
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

    private class MyNode<T> {
       private MyNode<T> previous;
       private MyNode<T> next;
       private T value;

        public MyNode(MyNode previous, T value, MyNode next){
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}

package home.work4;

public class MyNode<T> {
    MyNode<T> previous;
    MyNode<T> next;
    T value;

    public MyNode(MyNode previous, T value, MyNode next){
        this.previous = previous;
        this.value = value;
        this.next = next;
    }
}

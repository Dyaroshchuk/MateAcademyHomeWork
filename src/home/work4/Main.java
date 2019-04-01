package home.work4;

public class Main {

    public static void main(String[] args) {

        // Linked list check methods
        MyList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");
        myLinkedList.add("addedToFirst", 0);
        myLinkedList.add("addedToSecond", 1);
        myLinkedList.add("addToLast", 6);
        myLinkedList.set("newFirst", 2);
        System.out.println(myLinkedList.remove(6));
        System.out.println(myLinkedList.remove(""));

        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);

        MyLinkedList<String> myLinkedListTwo = new MyLinkedList<>();

        myLinkedListTwo.add("value second list");
        myLinkedListTwo.add("one more value second list");

        myLinkedList.addAll(myLinkedListTwo);

        System.out.println(myLinkedList);
    }
}

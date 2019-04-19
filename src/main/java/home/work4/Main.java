package home.work4;

public class Main {

    public static void main(String[] args) {
        // MyLinkedList check methods
        MyList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");
        myLinkedList.add("addedToFirst", 0);
        myLinkedList.add("addedToSecond", 1);
        myLinkedList.add("addToLast", 6);
        myLinkedList.set("newFirst", 2);
        System.out.println("removed last value is" + myLinkedList.remove(6));
        System.out.println(myLinkedList.remove(""));

        System.out.println("second value is " + myLinkedList.get(1));
        System.out.println("array size is " + myLinkedList.size());
        System.out.println(myLinkedList);

        MyList<String> myLinkedListTwo = new MyLinkedList<>();

        myLinkedListTwo.add("value second list");
        myLinkedListTwo.add("one more value second list");

        myLinkedList.addAll(myLinkedListTwo);
        System.out.println(myLinkedList);

        // MyArrayList check methods
        MyList<String> myArrayList = new MyArrayList<>();

        System.out.println("\n" + myArrayList.isEmpty());
        myArrayList.add("first");
        myArrayList.add("second");
        myArrayList.add("third");
        System.out.println("removed firs value is: " + myArrayList.remove(0));
        myArrayList.add("firstAgain", 0);
        myArrayList.remove("firstAgain");
        myArrayList.set("newSecond", 0);

        System.out.println("array size is: " + myArrayList.size());
        System.out.println("second value array is: " + myArrayList.get(1));
        System.out.println(myArrayList);

        myArrayList.addAll(myLinkedList);

        System.out.println(myArrayList);
    }
}

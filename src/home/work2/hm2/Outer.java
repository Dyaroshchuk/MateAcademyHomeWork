package home.work2.hm2;

public class Outer {

    public void printName() {
        System.out.println("Hi I'm Outer class, nice to meet you!");
        //Local Inner class
        class LocalInner {
            public void printName() {
                System.out.println("Hi I'm Local Inner class in printName method "
                                   + "of Outer class, nice to meet you!");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.printName();
    }

    // Nested Inner class
    class Inner {
        public void printName() {
            System.out.println("Hi I'm inner class, nice to meet you!");
        }
    }

    // Static Nested class
    static class StaticInner {
        public void printName() {
            System.out.println("Hi I'm static inner class, nice to meet you!");
        }
    }
}

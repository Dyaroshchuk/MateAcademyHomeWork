package home.work2.hm2;

/**
 * По одной задаче на каждый из видов классов: анонимный класс, вложенный, внутренний, локальный.
 */

public class ClassTypes {
    public static void main(String args[]) {
        // Anonymous class
        MathOperations plus = new MathOperations() {
            public double mathOperation(double valueOne, double valueTwo) {
                return valueOne + valueTwo;
            }
        };
        System.out.println(plus.mathOperation(6, 2)); // checking an anonymous class method

        // Lambda expression
        MathOperations multiplication = (valueOne, valueTwo) -> valueOne * valueTwo;
        System.out.println(multiplication.mathOperation(15, 4)); // checking a Lambda

        // checking Nested Inner class
        Outer.Inner inner = new Outer().new Inner();
        inner.printName(); // print Hi I'm inner class, nice to meet you!

        // checking Static Nested class
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.printName(); // print Hi I'm static inner class, nice to meet you!

        // checking Local Inner class
        Outer outer = new Outer();
        outer.printName(); // print outer massage and local class message
    }
}
package home.work2.hm2;

/**
 * По одной задаче на каждый из видов классов: анонимный класс, вложенный, внутренний, локальный.
 */

interface MathOperations {
    double Mathoperation(double a, double b);
}



public class ClassTypes {

    public static void main(String args[]) {

        //Anonymous class
        MathOperations plus = new MathOperations(){
           public double Mathoperation(double valueOne, double valueTwo){
              return valueOne + valueTwo ;
          }
        };
        System.out.println(plus.Mathoperation(6, 2)); // checking an anonymous class method, result 8


        //Lambda expression
        MathOperations multiplication = (valueOne, valueTwo) -> valueOne * valueTwo;
        System.out.println(multiplication.Mathoperation(15, 4)); // checking a Lambda expressions method result 60

        // checking Nested Inner class
        Outer.Inner inner = new Outer().new Inner();
        inner.printName(); // print Hi I'm inner class, nice to meet you!

        // checking Static Nested class
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.printName(); // print Hi I'm static inner class, nice to meet you!

        //checking Local Inner class
        Outer outer = new Outer();
        outer.printName();  // print Hi I'm Outer class, nice to meet you! and
                            // Hi I'm Local Inner class in printName method of Outer class, nice to meet you!





    }
}

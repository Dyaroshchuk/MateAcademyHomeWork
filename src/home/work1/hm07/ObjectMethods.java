package home.work1.hm07;

/**
 * 1.7 Реализовать каждый из Object методов, в частности - метод clone().
 * 1.7 clone (deep clone)
 */

public class ObjectMethods implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Human eliot = new Human("Eliot", 25, "John");
        Human secondEliot = new Human("Eliot", 25, "John");

        System.out.println(eliot.equals(secondEliot)); //method equals
        System.out.println(eliot.hashCode()); //method hashCode
        System.out.println(secondEliot.toString()); //toString
        System.out.println(eliot.getClass()); // getCalss
        Human thirdElior = (Human) eliot.clone(); //deep clone eliot
        System.out.println();

        System.out.println(eliot); //information eliot
        System.out.println(thirdElior); //information eliot clone

        thirdElior.setFather("Gogi"); //change eliot clone Father
        System.out.println();

        System.out.println(eliot); //information eliot
        System.out.println(thirdElior); //information eliot clone
    }
}

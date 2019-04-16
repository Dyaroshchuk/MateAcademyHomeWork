package home.work10.сomplexNumber;

public class Main {

    public static void main(String[] args) {
        ComplexNumber firstCompare = new ComplexNumber(7.5, 6.5);
        ComplexNumber secondCompare = new ComplexNumber(15.5, 3.5);

        System.out.println(firstCompare.equals(secondCompare));
        System.out.println(firstCompare.hashCode() == secondCompare.hashCode());
        System.out.println(secondCompare.equals(firstCompare));
        System.out.println(secondCompare.hashCode() == firstCompare.hashCode());
        System.out.println(secondCompare.hashCode());
        System.out.println(firstCompare.hashCode());
    }
}

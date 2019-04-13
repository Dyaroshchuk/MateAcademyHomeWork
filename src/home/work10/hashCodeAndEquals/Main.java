package home.work10.hashCodeAndEquals;

public class Main {

    public static void main(String[] args) {
        EqualsAndHashCode firstCompare = new EqualsAndHashCode(7.5, 6.5);
        EqualsAndHashCode secondCompare = new EqualsAndHashCode(15.5, 3.5);

        System.out.println(firstCompare.equals(secondCompare));
        System.out.println(firstCompare.hashCode() == secondCompare.hashCode());
        System.out.println(secondCompare.equals(firstCompare));
        System.out.println(secondCompare.hashCode() == firstCompare.hashCode());
        System.out.println(secondCompare.hashCode());
        System.out.println(firstCompare.hashCode());
    }
}

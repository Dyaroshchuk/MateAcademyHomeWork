package home.work2.hm1;

// class to check Builder pattern
public class Main{

    public static void main(String[] args) {
        Human eliots = new Human.Builder("Eliot")
                .setAge(25)
                .setHeight(180)
                .build();
        Human john = new Human.Builder("John")
                .setSurname("Black")
                .build();
    }
}

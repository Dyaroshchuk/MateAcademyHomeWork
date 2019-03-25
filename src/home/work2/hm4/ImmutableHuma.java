package home.work2.hm4;

final class ImmutableHuma {
    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int weight;

    public ImmutableHuma(String name, String surname, int age, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

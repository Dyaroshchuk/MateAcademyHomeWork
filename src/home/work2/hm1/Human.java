package home.work2.hm1;

/**
 * Написать паттерн Builder
 */

public class Human {

    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int  weight;

    public Human(String name, String surname, int age, int height, int weight) {
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

    public static class Builder {
        private String name;
        private String surname;
        private int age;
        private int height;
        private int  weight;

        public Builder setName(String name) {
            this.name = name;

            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;

            return this;
        }

        public Builder setAge(int age) {
            this.age = age;

            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;

            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;

            return this;
        }

        public Human build() {
            return new Human(name, surname, age, height, weight);
        }
    }




}

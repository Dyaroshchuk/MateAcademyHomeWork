package home.work1.hm07;

import java.util.Objects;

public class Human implements Cloneable {
    private String name;
    private int age;
    private Father father;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String father) {
        this.name = name;
        this.age = age;
        this.father = new Father(father);
    }

    public String getFather() {
        return father.getName();
    }

    public void setFather(String newFather) {
        father.setName(newFather);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return getAge() == human.getAge() &&
                getName().equals(human.getName()) &&
                getFather().equals(human.getFather());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getFather());
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Age:" + getAge() + " HashCode:"
                + hashCode() + "Father: " + father.getName();
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        Human newHuman = (Human) super.clone();
        newHuman.father = (Father) father.clone();
        return newHuman;
    }
}

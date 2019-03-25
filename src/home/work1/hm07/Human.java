package home.work1.hm07;

public class Human implements Cloneable {
    private String name;
    private int age;
    private Father father;

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

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String father) {
        this.name = name;
        this.age = age;
        this.father = new Father(father);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getAge();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Human other = (Human) obj;
        if (getName() != other.getName()) {
            return false;
        }
        if (getAge() != other.getAge()) {
            return false;
        }
        return true;
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

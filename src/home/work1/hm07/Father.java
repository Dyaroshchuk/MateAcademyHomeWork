package home.work1.hm07;

public class Father implements Cloneable {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Father(String name) {
        this.name = name;
    }

    @Override
    protected Father clone() throws CloneNotSupportedException {
        return (Father) super.clone();
    }
}

package home.work7.model;

import java.io.Serializable;

public class Human implements Serializable {

    private String name;
    private String phoneNumber;
    private String email;

    public Human(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

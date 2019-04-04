package home.work6.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Gorilla");
        animals[1] = new Animal("Cat");
        animals[2] = new Animal("Dog");
        animals[3] = new Animal("Turtle");
        animals[4] = new Animal("Dolphin");
        byte[] byteArrayAnimals = serializationArray(animals);

        System.out.println(Arrays.toString(animals));
        System.out.println(Arrays.toString(byteArrayAnimals));
        Animal[] deserializeAnimal = deserializeAnimalArray(byteArrayAnimals);
        System.out.println(Arrays.toString(deserializeAnimal));
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = ois.readInt();
            Animal[] deserializeAnimal = new Animal[size];

            for (int i = 0; i < size; i++) {
                deserializeAnimal[i] = (Animal) ois.readObject();
            }
            return deserializeAnimal;
        } catch (ClassCastException | IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] serializationArray(Animal[] animals) {
        try (ByteArrayOutputStream outputArray = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(outputArray)) {
            byte[] byteArrayAnimals = null;
            oos.writeInt(animals.length);
            for (int i = 0; i < animals.length; i++) {
                oos.writeObject(animals[i]);
            }
            oos.flush();
            byteArrayAnimals = outputArray.toByteArray();
            return byteArrayAnimals;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}

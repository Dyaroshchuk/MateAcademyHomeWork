package home.work7.dao;

import home.work7.di.Component;
import home.work7.model.Human;

import java.io.*;
import java.util.NoSuchElementException;

@Component
public class FileHumanDao implements Dao<Human> {

    @Override
    public void save(Human human) {
        try(ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(new FileOutputStream("humanStorage.dat"))) {
            objectOutputStream.writeObject(human);
        } catch (IOException e) {
            System.out.println("Failed to save a guest data");
        }
    }

    @Override
    public Human get() {
        try (ObjectInputStream objectInputStream
                     = new ObjectInputStream(new FileInputStream("humanStorage.dat"))) {
            return (Human) objectInputStream.readObject();
        } catch (IOException e) {
            throw new NoSuchElementException("Can't find file: humanStorage.dat");
        } catch (ClassNotFoundException e) {
            throw  new NoSuchElementException("Can't find the guest in humanStorage.dat");
        }
    }
}

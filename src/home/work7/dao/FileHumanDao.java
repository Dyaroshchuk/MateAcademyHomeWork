package home.work7.dao;

import home.work7.di.Component;
import home.work7.model.Human;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class FileHumanDao implements Dao<Human> {

    @Override
    public void save(Human human) {
        try (ObjectOutputStream objectOutputStream
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
            throw new NoSuchElementException("Can't find the guest in humanStorage.dat");
        }
    }

    @Override
    public List<Human> getAll() {
        try (ObjectInputStream objectInputStream
                     = new ObjectInputStream(new FileInputStream("humanStorage.dat"))) {
            List<Human> getList = new ArrayList<>();
            getList.add((Human) objectInputStream.readObject());
            return getList;
        } catch (IOException e) {
            throw new NoSuchElementException("Can't find file: humanStorage.dat");
        } catch (ClassNotFoundException e) {
            throw new NoSuchElementException("Can't find the guest in humanStorage.dat");
        }
    }
}

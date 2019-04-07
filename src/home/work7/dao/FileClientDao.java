package home.work7.dao;

import home.work7.di.Component;
import home.work7.model.Client;

import java.io.*;
import java.util.NoSuchElementException;

@Component
public class FileClientDao implements Dao<Client> {

    @Override
    public void save(Client client) {
        try(ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(new FileOutputStream("clientStorage.dat"))) {
            objectOutputStream.writeObject(client);
        } catch (IOException e) {
            System.out.println("Failed to save client data");
        }
    }

    @Override
    public Client get() {
        try (ObjectInputStream objectInputStream
                     = new ObjectInputStream(new FileInputStream("clientStorage.dat"))) {
            return (Client) objectInputStream.readObject();
        } catch (IOException e) {
            throw new NoSuchElementException("Can't find file: clientStorage.dat");
        } catch (ClassNotFoundException e) {
            throw  new NoSuchElementException("Can't find the client in clientStorage.dat");
        }
    }
}

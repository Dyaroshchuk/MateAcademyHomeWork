package home.work7.dao;

import home.work7.di.Component;
import home.work7.model.Client;
import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryClientDao implements Dao<Client> {

    private static final List<Client> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Client client) {
        inMemoryStorage.add(client);
    }

    @Override
    public Client get() {
        return inMemoryStorage.get(0);
    }

    public List<Client> getAll() {
        List<Client> getArray = new ArrayList<>();
        for (int i = 0; i < inMemoryStorage.size(); i++) {
            getArray.add(inMemoryStorage.get(i));
        }
        return getArray;
    }
}

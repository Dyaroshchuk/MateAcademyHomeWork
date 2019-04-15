package home.work7.dao;

import home.work7.di.Component;
import home.work7.model.Human;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryHumanDao implements Dao<Human> {

    private static final List<Human> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Human object) {
        inMemoryStorage.add(object);
    }

    @Override
    public Human get() {
        return inMemoryStorage.get(0);
    }

    @Override
    public List<Human> getAll() {
        List<Human> getArray = new ArrayList<>();
        for (int i = 0; i < inMemoryStorage.size(); i++) {
            getArray.add(inMemoryStorage.get(i));
        }
        return getArray;
    }
}

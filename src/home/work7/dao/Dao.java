package home.work7.dao;

import java.util.List;

public interface Dao<T> {
    void save(T object);

    T get();

    List<T> getAll();
}

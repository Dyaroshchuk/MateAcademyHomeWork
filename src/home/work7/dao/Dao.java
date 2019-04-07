package home.work7.dao;

public interface Dao<T> {
    void save(T object);

    T get();
}

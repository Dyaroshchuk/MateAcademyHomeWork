package home.work8.streamAPI;

public interface Sendable<T> {

    String getFrom();

    String getTo();

    T getContent();
}

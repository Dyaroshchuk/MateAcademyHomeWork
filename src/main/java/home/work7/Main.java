package home.work7;

import home.work7.di.Injector;
import home.work7.handler.ConsoleHandler;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}

package home.work7.di;

import home.work7.dao.*;
import home.work7.factory.ClientDaoFactory;
import home.work7.factory.HumanDaoFactory;
import home.work7.handler.ConsoleHandler;
import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDaoClass = InMemoryClientDao.class;
        Class fileHumanDaoClass = FileHumanDao.class;
        Class inMemoryHumanDaoClass = InMemoryHumanDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                openAccessToClientDao(field, fileClientDaoClass, inMemoryClientDaoClass);

                openAccessToHumanDao(field, fileHumanDaoClass, inMemoryHumanDaoClass);
                }
            }
        }

    private static void openAccessToClientDao(Field field, Class fileDaoClass, Class inMemoryDaoClass)
            throws IllegalAccessException {
        if (field.getName().equals("clientDao")) {
            boolean fileClientDao = fileDaoClass.isAnnotationPresent(Component.class);
            if (fileClientDao) {
                System.out.println("Open access to work with Client in files");
            }
            boolean inMemoryClientDao = inMemoryDaoClass.isAnnotationPresent(Component.class);
            if (inMemoryClientDao) {
                System.out.println("Open access to work with Client in Ram");
            }
            Dao clientDao = ClientDaoFactory.getClientDao(fileClientDao, inMemoryClientDao);
            field.set(null, clientDao);
        }
    }

    private static void openAccessToHumanDao(Field field, Class fileDaoClass, Class inMemoryDaoClass)
            throws IllegalAccessException {
        if (field.getName().equals("humanDao")) {
            boolean fileHumanDao = fileDaoClass.isAnnotationPresent(Component.class);
            if (fileHumanDao) {
                System.out.println("Open access to work with Guest in files");
            }
            boolean inMemoryHumanDao = inMemoryDaoClass.isAnnotationPresent(Component.class);
            if (inMemoryHumanDao) {
                System.out.println("Open access to work with Guest in Ram");
            }
            Dao humanDao = HumanDaoFactory.getHumanDao(fileHumanDao, inMemoryHumanDao);
            field.set(null, humanDao);
        }
    }
}

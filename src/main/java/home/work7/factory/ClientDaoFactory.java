package home.work7.factory;

import home.work7.dao.Dao;
import home.work7.dao.FileClientDao;
import home.work7.dao.InMemoryClientDao;
import home.work7.service.PropertyLoader;
import java.io.IOException;

public class ClientDaoFactory {

    private static final Dao inMemoryDao = new InMemoryClientDao();
    private static final Dao fileDao = new FileClientDao();

    public static Dao getClientDao(boolean isFileDao, boolean isInMemoryDao) {
        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("memory") && isInMemoryDao) {
                return inMemoryDao;
            }
        } catch (IOException e) {
            System.out.println("haven't access to the file");
        }
        if (isFileDao) {
            return fileDao;
        } else {
            throw new ComponentNotFoundException();
        }
    }
}

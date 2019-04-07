package home.work7.factory;

import home.work7.dao.*;
import home.work7.service.PropertyLoader;
import java.io.IOException;

public class HumanDaoFactory {

    private static final Dao inMemoryDao = new InMemoryHumanDao();
    private static final Dao fileDao = new FileHumanDao();

    public static Dao getHumanDao(boolean isFileDao, boolean isInMemoryDao) {
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

package home.work7.handler;

import home.work7.dao.Dao;
import home.work7.di.Inject;
import home.work7.model.Client;
import home.work7.model.Human;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static Dao clientDao;

    @Inject
    private static Dao humanDao;

    static public void handle() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - to client, 2 - to guest, 3 - exit");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    operationForClient(scanner);
                    break;
                case 2:
                    operationForHuman(scanner);
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void operationForClient(Scanner scanner) {
        while (true) {
            System.out.println("1 - to add client, 2 - to get client, 3 - exit");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    addClientInfo(scanner);
                    break;
                case 2:
                    System.out.println(clientDao.getAll());
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void operationForHuman(Scanner scanner) {
        while (true) {
            System.out.println("1 - to add guest, 2 - to get guest, 3 - exit");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    addHumanInfo(scanner);
                    break;
                case 2:
                    System.out.println(humanDao.getAll());
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void addClientInfo(Scanner scanner) {
        System.out.println("Input client information");
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phoneNumber");
        String phone = scanner.next();
        Client client = new Client(name, phone);
        clientDao.save(client);
    }

    private static void addHumanInfo(Scanner scanner) {
        System.out.println("Input Guest information");
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phoneNumber");
        String phone = scanner.next();
        System.out.println("Input email");
        String email = scanner.next();
        Human guest = new Human(name, phone, email);
        humanDao.save(guest);
    }
}

package home.work8.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Создание списка из трех почтовых сообщений.
        List<MailMessage> messages = createMailMessagesList();

        // Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

        // Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService);

        // Получение и проверка словаря "почтового ящика",
        // где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox();

        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ) : "wrong mailService mailbox content (1)";

        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ) : "wrong mailService mailbox content (2)";

        assert mailBox.get("check with random string").equals(Collections.<String>emptyList())
                : "wrong mailService mailbox content (3)";


        // Создание списка из трех зарплат.
        List<Salary> salaryList = createSalaryList();

        // Создание почтового сервиса, обрабатывающего зарплаты.
        MailService<Integer> salaryService = new MailService<>();

        // Обработка списка зарплат почтовым сервисом
        salaryList.forEach(salaryService);

        // Получение и проверка словаря "почтового ящика",
        // где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salaryList.get(0).getTo()).equals(Arrays.asList(1))
                : "wrong salaries mailbox content (1)";
        assert salaries.get(salaryList.get(1).getTo()).equals(Arrays.asList(Integer.MAX_VALUE))
                : "wrong salaries mailbox content (2)";
        assert salaries.get(salaryList.get(2).getTo()).equals(Arrays.asList(salaryList.get(2).getContent()))
                : "wrong salaries mailbox content (3)";
    }

    private static List<MailMessage> createMailMessagesList() {
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        return Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );
    }

    private static List<Salary> createSalaryList() {
        // Random variables
        String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = Math.abs(new Random().nextInt());  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

        return Arrays.asList(salary1, salary2, salary3);
    }


}

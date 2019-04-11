package home.work8.streamAPI;

public class MailMessage implements Sendable<String> {
    private String nameFrom;
    private String nameTo;
    private String message;

    public MailMessage(String nameFrom, String nameTo, String message) {
        this.nameFrom = nameFrom;
        this.nameTo = nameTo;
        this.message = message;
    }

    @Override
    public String getFrom() {
        return nameFrom;
    }

    @Override
    public String getTo() {
        return nameTo;
    }

    @Override
    public String getContent() {
        return message;
    }
}

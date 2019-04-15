package home.work8.streamAPI;

public class Salary implements Sendable<Integer>{
    private String companyName;
    private String employeeName;
    private Integer salary;

    public Salary(String companyName, String employeeName, int salary) {
        this.companyName = companyName;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return companyName;
    }

    @Override
    public String getTo() {
        return employeeName;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}

package java8package.task7constructorreference;

public class Employee {

    private String name;
    private int account;
    private float salary;

    public Employee(String name, int account, float salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public String toString() {
        return "name: " + name + " account: " + account + " salary: " + salary;
    }
}
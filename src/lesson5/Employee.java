package lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.printf("Employee:\n%s\n%s\n%s\n", fullName, position, email);
        System.out.println("phone - " + phone);
        System.out.println("salary - " + salary);
        System.out.println("age - " + age);
    }
}
package Lesson5;

public class Employees {

    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    public Employees(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("Сотрудник %s на должности %s. Личные данные: email %s, номер телефона %s, зарплата %d, возраст %d "
                , fullName, position, email, phoneNumber, salary, age);
    }
}


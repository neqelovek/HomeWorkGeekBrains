package Lesson5;

public class HomeWork {
    public static void main(String[] args) {

        Employees employee1 = new Employees("Pushkin Aleksandr Sergeevich", "Director", "Ivanov@mail.com", "+7 953 664 74 32", 100000, 56);
        Employees employee2 = new Employees("Tolstoy Lev Nikolaevich", "Accountant", "Petrov@mail.ru", "+7 912 334 76 23", 70000, 63);
        Employees employee3 = new Employees("Bunin Ivan Alexeevitch", "Engineer", "Bunin@mail.com", "+7 952 343 54 23", 150000, 43);
        Employees employee4 = new Employees("Yesenin Sergey Alexandrovich", "Head master", "Yesenin@mail.com", "+7 954 321 65 78", 130000, 37);
        Employees employee5 = new Employees("Minsky Nikolay Maximovich", "Worker", "Minsky@mail.com", "+7 954 853 67 43", 50000, 23);

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();
        System.out.println();

        System.out.println("Сведенья о сотрудниках чей возраст превысил отметку 40 лет:");
        Employees[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (Employees employee : employees) {
            if (employee.age > 40) {
                System.out.println(employee);
            }
        }
    }
}



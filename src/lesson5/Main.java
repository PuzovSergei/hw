package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов И.И.", "CEO", "Ivanov@mail.ru", 111, 500, 50);
        Employee employee2 = new Employee("Сидоров С.А.", "CEO", "Sidorov@mail.ru", 222, 400, 45);
        Employee employee3 = new Employee("Жуков В.К.", "CEO", "Zhukov@mail.ru", 333, 300, 40);
        Employee employee4 = new Employee("Васечкин С.В.", "CEO", "Vasechkin@mail.ru", 444, 500, 35);
        Employee employee5 = new Employee("Петров Р.М.", "CEO", "Petrov@mail.ru", 555, 500, 30);

        employee5.info();

        System.out.println("Задание 4-5:");

        Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Иванов И.И.", "CEO", "Ivanov@mail.ru", 111, 500, 50);
            persArray[1] = new Employee("Сидоров С.А.", "CEO", "Sidorov@mail.ru", 222, 400, 45);
            persArray[2] = new Employee("Жуков В.К.", "CEO", "Zhukov@mail.ru", 333, 300, 40);
            persArray[3] = new Employee("Васечкин С.В.", "CEO", "Vasechkin@mail.ru", 444, 500, 35);
            persArray[4] = new Employee("Петров Р.М.", "CEO", "Petrov@mail.ru", 555, 500, 30);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }
}

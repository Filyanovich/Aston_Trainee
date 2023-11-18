package lessons.lesson4;

public class Person {
    public String name;
    private String post;//должность
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Почта: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }


    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Иванов Иван", "Инженер", "ivanov@mail.ru", "80295698423", 40000, 42);
        personArray[1] = new Person("Соловьева Мария", "Бухгалтер", "solovyova@mail.ru", "80335487200", 25000, 28);
        personArray[2] = new Person("Петров Александр", "Программист", "petrov@mail.ru", "80295566987", 100000, 37);
        personArray[3] = new Person("Селезнев Петр", "Программист", "seleznev@mail.ru", "80295698423", 10000, 50);
        personArray[4] = new Person("Королев Вячеслав", "Инженер-программист", "korolov@mail.ru", "80299140677", 120000, 21);

        //Вывод объектов в консоль
        for (Person person : personArray) {
            person.printInfo();
            System.out.println("-----------");
        }

        //Вывод информации о сотрудниках которым больше 40 лет
        System.out.println("\nСотрудники старше 40 лет:");
        for (Person person : personArray) {
            if (person.age > 40) {
                person.printInfo();
                System.out.println("-----------");
            }
        }
    }
}


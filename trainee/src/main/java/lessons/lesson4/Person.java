package lessons.lesson4;

public class Person {
    public String name;
    private String post;//���������
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
        System.out.println("���: " + name);
        System.out.println("���������: " + post);
        System.out.println("�����: " + email);
        System.out.println("�������: " + phone);
        System.out.println("��������: " + salary);
        System.out.println("�������: " + age);
    }


    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("������ ����", "�������", "ivanov@mail.ru", "80295698423", 40000, 42);
        personArray[1] = new Person("��������� �����", "���������", "solovyova@mail.ru", "80335487200", 25000, 28);
        personArray[2] = new Person("������ ���������", "�����������", "petrov@mail.ru", "80295566987", 100000, 37);
        personArray[3] = new Person("�������� ����", "�����������", "seleznev@mail.ru", "80295698423", 10000, 50);
        personArray[4] = new Person("������� ��������", "�������-�����������", "korolov@mail.ru", "80299140677", 120000, 21);

        //����� �������� � �������
        for (Person person : personArray) {
            person.printInfo();
            System.out.println("-----------");
        }

        //����� ���������� � ����������� ������� ������ 40 ���
        System.out.println("\n���������� ������ 40 ���:");
        for (Person person : personArray) {
            if (person.age > 40) {
                person.printInfo();
                System.out.println("-----------");
            }
        }
    }
}


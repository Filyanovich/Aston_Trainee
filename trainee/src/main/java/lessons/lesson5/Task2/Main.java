package lessons.lesson5.Task2;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2, 4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("��������� ���������� ������������� [ ��������, �������, ���� ����, ���� ������ ]");

        System.out.print("��������������� �����: ");
        circle.printInfo("������", "������");

        System.out.print("��������������� ��������������: ");
        rectangle.printInfo("�����", "�������");

        System.out.print("��������������� ������������: ");
        triangle.printInfo("�����", "�������");

    }
}

package lessons;

public class Lesson2 {

    /* 1.�������� ����� printThreeWords(),
     * �������� ��� ������ ������ ���������� � ������� ��� �����: Orange, Banana, Apple.*/
    public static void printThreeWords() {
        String s1 = "Orange", s2 = "Banana", s3 = "Apple";
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
    }

    /* 2.������?�� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b,
     � ���������������� �� ������ ����������, �������� ��������.
     ����� ����� ������ �������������� ��� ����������, � ���� �� ����� ������ ���
     ����� 0, �� ������� � ������� ��������� ������ ��������������,
     � ��������� ������ - ������ ��������������;*/
    public static void checkSumSign() {
        int a = 5, b = -8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("����� �������������");
        } else System.out.println("����� �������������");
    }

    /* 3.������?�� ����� printColor() � ���� �������� ������� int ���������� value
    � ��������������� �� ����� ���������. ���� value ������ 0 (0 ������������),
    �� � ������� ����� ������ ������� ��������� ��������?�,
    ���� ����� � �������� �� 0 (0 �������������) �� 100 (100 ������������),
    �� �������?�, ���� ������ 100 (100 �������������) - ��������?�;*/
    public static void printColor() {
        int value = 500;
        if (value <= 0) {
            System.out.println("�������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else {
            System.out.println("�������");
        }
    }

    /*�������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b,
     � ��������������� �� ������ ����������, �������� ��������.
     ���� a ������ ��� ����� b, �� ���������� ������� � ������� ��������� �a >= b�, � ��������� ������ �a < b�;
    */
    public static void compareNumbers() {
        int a = 8, b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        System.out.println("������� �1:");
        printThreeWords();
        System.out.println("\n������� �2:");
        checkSumSign();
        System.out.println("\n������� �3:");
        printColor();
        System.out.println("\n������� �4:");
        compareNumbers();
    }
}

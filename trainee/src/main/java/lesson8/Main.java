package lesson8;

public class Main {

    public static void main(String[] args) {

        System.out.println("������ �1");

        String[] arrString = {"One", "Two", "Three", "One", "Four", "Five", "Six", "Seven", "Two", "Eight", "Eight", "Nine", "Ten"};
        System.out.println("���������� �����: " + StringMethods.uniqueWords(arrString));
        System.out.println("���������� ����������: " + StringMethods.countDublicate(arrString));

        System.out.println("\n������ �2");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("������ ����", "+375445899601");
        phoneDirectory.add("��������� ������", "+79176582003");
        phoneDirectory.add("������� �����", "+375332225619");
        phoneDirectory.add("������ ���������", "+375295840366");
        phoneDirectory.add("������ ����", "+79158952703");

        phoneDirectory.get("������ ����");
        phoneDirectory.get("������� ����");

    }
}

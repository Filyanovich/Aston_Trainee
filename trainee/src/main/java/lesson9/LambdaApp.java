package lesson9;

import java.util.*;
import java.util.stream.IntStream;

public class LambdaApp {

    //��� ������ ������ ��������-��������������� ����� ����� ���������� ���������� ������ �����
    public static void countEvenNumbers(int[] array) {
        System.out.println(Arrays.toString(array));

        long evenNumber = IntStream.of(array).filter(w -> w % 2 == 0).count();
        System.out.println("���������� ������ �����: " + evenNumber);
    }

    /*������ ���������, ��������� �� �����: �Highload�, �High�, �Load�, �Highload�. ����� � ��� ��������� ��������� �����������:
      1. ���������, ������� ��� ������ �High� ����������� � ���������;
      2. ����������, ����� ������� � ��������� ��������� �� ������ �����. ���� �� �������� ������ ���������, �� ����� ������������ 0;*/
    public static void highCollection(List<String> list) {
        System.out.println(list);

        int count = Collections.frequency(list, "High");
        System.out.println("������ \"High\" ����������� � ��������� " + count + " ���");

        String firstElement = (list.isEmpty() ? null : list.get(0));
        System.out.println("������ ������� ���������: " + firstElement);


    }

    // ������ ���������, ���������� �������� "f10", "f15", "f2", "f4", "f4".
    // ���������� ������������� ������ �� ����������� � �������� �� � ������;
    public static void sortedString(List<String> list) {
        System.out.println(list);

        Collections.sort(list);
        String[] arr = list.stream().toArray(String[]::new);
        System.out.println("��������������� ������: " + Arrays.toString(arr));
    }

    /*����� �������� ���������, ������� ����� ��������� �� ������������ ���� ��������� �������.
     ��� ������ ������������ ������ ������ ������ - ��������� ������ ���������� ���� ������ �� ������������
     � ������� � ������� ������, ������������ �� ����� f (��������).*/
    public static void printLogins() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        while (true) {
            System.out.print("������� ����� (��� ���������� ������� ������ ������): ");
            String login = scanner.nextLine().trim();

            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        System.out.println("������, ������������ �� ����� f:");
        logins.stream().filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }

}

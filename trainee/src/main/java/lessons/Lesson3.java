package lessons;

import java.util.Arrays;

public class Lesson3 {

    /*1.�������� �����, ����������� �� ���� ��� ����� ����� � ����������� ��� �� ����� ����� � �������� �� 10 �� 20
     (������������), ���� �� � ������� true, � ��������� ������ � false.*/
    public static boolean chekSumRange(int a, int b) {
        boolean sum = a + b >= 10 && a + b <= 20;
        return sum;
    }

    /*�������� �����, �������� � �������� ���������� ���������� ������ � �����,
    ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;*/
    public static void printStrings(String s, int num) {
        while (num > 0) {
            System.out.println(s);
            num--;
        }
    }

    /*�������� �����, �������� � �������� ��������� ���������� ����� �����,
     ����� ������ ���������� � �������,������������� �� ����� �������� ��� �������������.
     ���������: ���� ������� ������������� ������.
     */
    public static void chekStatusNumberVoid(int num) {
        if (num >= 0) {
            System.out.println(num + "-������������� �����");
        } else {
            System.out.println(num + "-������������� �����");
        }
    }

    /*�������� �����, �������� � �������� ��������� ���������� ����� �����.
    ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.
     */
    public static boolean chekStatusNumberBool(int num) {
        boolean result = num >= 0;
        return result;
    }

    /*�������� �����, ������� ����������, �������� �� ��� ����������,
    � ���������� boolean (���������� - true, ������������ - false).
    ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.*/
    public static boolean leapYer(int year) {
        if (((year % 4) == 0) && !((year % 100) == 0)) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    /*������ ������������� ������, ��������� �� ��������� 0 � 1.
     ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. � ������� ����� � ������� �������� 0 �� 1, 1 �� 0;*/
    public static int[] flipArray() {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 1};
        System.out.println("\n������� 6\n�������� ������: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        return arr;
    }

    /*������ ������ ������������� ������ ������ 100.
    � ������� ����� ��������� ��� ���������� 1 2 3 4 5 6 7 8 ... 100;*/
    public static int[] fillingpArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /* ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������,
    � ����� ������� 6 �������� �� 2;*/
    public static int[] doubling() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    /*������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
     � � ������� �����(-��) ��������� ��� ������������ �������� ���������
     (����� ������ ���� �� ����������, ���� ��� ������).���������� �������� ����� �� ���������� �����
      �� ���������� ��������: ������� ����� ��������� �����, �� ���� [0][0], [1][1], [2][2], ..., [n][n];*/
    public static void fillingSquareArray() {
        int n = 6;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - 1 - i] = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    /*�������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������ ���������� ������
    ���� int ������ len, ������ ������ �������� ����� initialValue.*/
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("������� 1 \n" + chekSumRange(5, 5));

        System.out.println("\n������� 2");
        printStrings("hello", 2);

        System.out.println("\n������� 3");
        chekStatusNumberVoid(0);

        System.out.println("\n������� 4\n" + chekStatusNumberBool(-1));

        System.out.println("\n������� 5\n" + leapYer(2024));

        //������� 6
        System.out.println(Arrays.toString(flipArray()));

        System.out.println("\n������� 7\n" + Arrays.toString(fillingpArray()));

        System.out.println("\n������� 8");
        System.out.println("�������� ������ : [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]");
        System.out.println(Arrays.toString(doubling()));

        System.out.println("\n������� 9");
        fillingSquareArray();

        System.out.println("\n������� 10\n" + Arrays.toString(createArray(3, 10)));
    }
}

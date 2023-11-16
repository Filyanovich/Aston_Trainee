package lessons;

import java.util.Arrays;

public class Lesson3 {

    /*1.Написать метод, принимающий на вход два целых числа и проверяющий что их сумма лежит в пределах от 10 до 20
     (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean chekSumRange(int a, int b) {
        boolean sum = a + b >= 10 && a + b <= 20;
        return sum;
    }

    /*Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void printStrings(String s, int num) {
        while (num > 0) {
            System.out.println(s);
            num--;
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль,положительное ли число передали или отрицательное.
     Замечание: ноль считаем положительным числом.
     */
    public static void chekStatusNumberVoid(int num) {
        if (num >= 0) {
            System.out.println(num + "-Положительное число");
        } else {
            System.out.println(num + "-Отрицательное число");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean chekStatusNumberBool(int num) {
        boolean result = num >= 0;
        return result;
    }

    /*Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, невисокосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean leapYer(int year) {
        if (((year % 4) == 0) && !((year % 100) == 0)) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    /*Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static int[] flipArray() {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 1};
        System.out.println("\nЗадание 6\nИсходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        return arr;
    }

    /*Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/
    public static int[] fillingpArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;*/
    public static int[] doubling() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     (можно только одну из диагоналей, если обе сложно).Определить элементы одной из диагоналей можно
      по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];*/
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

    /*Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
    типа int длиной len, каждая ячейка которого равна initialValue.*/
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1 \n" + chekSumRange(5, 5));

        System.out.println("\nЗадание 2");
        printStrings("hello", 2);

        System.out.println("\nЗадание 3");
        chekStatusNumberVoid(0);

        System.out.println("\nЗадание 4\n" + chekStatusNumberBool(-1));

        System.out.println("\nЗадание 5\n" + leapYer(2024));

        //Задание 6
        System.out.println(Arrays.toString(flipArray()));

        System.out.println("\nЗадание 7\n" + Arrays.toString(fillingpArray()));

        System.out.println("\nЗадание 8");
        System.out.println("Исходный массив : [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]");
        System.out.println(Arrays.toString(doubling()));

        System.out.println("\nЗадание 9");
        fillingSquareArray();

        System.out.println("\nЗадание 10\n" + Arrays.toString(createArray(3, 10)));
    }
}

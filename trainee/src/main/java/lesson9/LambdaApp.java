package lesson9;

import java.util.*;
import java.util.stream.IntStream;

public class LambdaApp {

    //Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел
    public static void countEvenNumbers(int[] array) {
        System.out.println(Arrays.toString(array));

        long evenNumber = IntStream.of(array).filter(w -> w % 2 == 0).count();
        System.out.println("Количество четных чисел: " + evenNumber);
    }

    /*Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
      1. Посчитать, сколько раз объект «High» встречается в коллекции;
      2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;*/
    public static void highCollection(List<String> list) {
        System.out.println(list);

        int count = Collections.frequency(list, "High");
        System.out.println("Объект \"High\" встречается в коллекции " + count + " раз");

        String firstElement = (list.isEmpty() ? null : list.get(0));
        System.out.println("Первый элемент коллекции: " + firstElement);


    }

    // Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4".
    // Необходимо отсортировать строки по возрастанию и добавить их в массив;
    public static void sortedString(List<String> list) {
        System.out.println(list);

        Collections.sort(list);
        String[] arr = list.stream().toArray(String[]::new);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    /*Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
     Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя
     и вывести в консоль логины, начинающиеся на букву f (строчную).*/
    public static void printLogins() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        while (true) {
            System.out.print("Введите логин (Для завершения введите пустую строку): ");
            String login = scanner.nextLine().trim();

            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        System.out.println("Логины, начинающиеся на букву f:");
        logins.stream().filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }

}

package lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] randomArray = new Random().ints(10, 0, 100).toArray();
        LambdaApp.countEvenNumbers(randomArray);

        System.out.println("\nЗадание №2");
        List<String> highList = new ArrayList<String>();
        Collections.addAll(highList, "Highload", "High", "Load", "Highload");
        LambdaApp.highCollection(highList);

        System.out.println("\nЗадание №3");
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "f4", "f10", "f15", "f2", "f4");
        LambdaApp.sortedString(list);

        System.out.println("\nЗадание №4");
        List<Student> student = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        double averageAge = student.stream().filter(s -> s.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(Double.NaN);
        System.out.println("Средний возраст студентов мужского пола: " + Math.round(averageAge));

        System.out.println("Грозит получение повестки в этом году:");
        student.stream()
                .filter(s -> s.getGender() == Gender.MAN && s.getAge() >= 18 && s.getAge() <= 27)
                .forEach(s -> System.out.println(s.getName() + ", " + s.getAge()));

        System.out.println("\nЗадание №5");
        LambdaApp.printLogins();

    }
}

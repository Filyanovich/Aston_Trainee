package lesson8;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача №1");

        String[] arrString = {"One", "Two", "Three", "One", "Four", "Five", "Six", "Seven", "Two", "Eight", "Eight", "Nine", "Ten"};
        System.out.println("Уникальные слова: " + StringMethods.uniqueWords(arrString));
        System.out.println("Количество дубликатов: " + StringMethods.countDublicate(arrString));

        System.out.println("\nЗадача №2");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов Иван", "+375445899601");
        phoneDirectory.add("Игнатьева Оксана", "+79176582003");
        phoneDirectory.add("Соколов Игорь", "+375332225619");
        phoneDirectory.add("Петров Александр", "+375295840366");
        phoneDirectory.add("Иванов Иван", "+79158952703");

        phoneDirectory.get("Иванов Иван");
        phoneDirectory.get("Иванова Анна");

    }
}

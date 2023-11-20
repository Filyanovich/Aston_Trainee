package lessons.lesson5;

public class AnimalsApp {
    public static void main(String[] args) {
        Animals c1 = new Cat("Барсик");
        Animals c2 = new Cat("Мурзик");
        Animals c3 = new Cat("Люсик");

        Animals d1 = new Dog("Рэкс");
        Animals d2 = new Dog("Бобик");

        //Действия животных
        c1.swim(10);
        c2.run(200);
        d1.swim(2);
        d2.run(100);

        System.out.println("\nСоздано котов: " + Cat.getCount());
        System.out.println("Создано собак: " + Dog.getCount());
        System.out.println("Создано животных: " + Animals.getCount());

    }
}

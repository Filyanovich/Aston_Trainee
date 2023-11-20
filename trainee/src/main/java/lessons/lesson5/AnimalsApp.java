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
        c3.run(500);
        d1.swim(2);
        d2.run(100);

        System.out.println("\nСоздано котов: " + Cat.getCount());
        System.out.println("Создано собак: " + Dog.getCount());
        System.out.println("Создано животных: " + Animals.getCount());

        System.out.println("\nКОТЫ И ТАРЕЛКА");
        Cat[] cats = {new Cat("Васька", 25), new Cat("Мурзик", 20),
                new Cat("Пушистик", 12), new Cat("Мяу", 5)};

        Plate plate = new Plate(50);
        plate.addFood(2);
        for (Cat cat : cats) {
            plate.printInfo();
            cat.eat(plate);
            cat.infoHungryCat();
        }

    }
}

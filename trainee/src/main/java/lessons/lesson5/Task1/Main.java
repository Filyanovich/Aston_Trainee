package lessons.lesson5.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");
        Animals a1=new Animals("Жираф");

        cat.swim(50);
        cat.run(2);

        dog.swim(11);
        dog.run(150);

        a1.run(6);

    }
}

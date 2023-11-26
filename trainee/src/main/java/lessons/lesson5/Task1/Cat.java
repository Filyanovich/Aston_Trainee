package lessons.lesson5.Task1;

public class Cat implements AnimalAction {
    private String name;
    int maxRunDistance;

    public Cat(String name) {
        this.name = name;
        maxRunDistance = 200;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(name + " не может пробежать " + distance + " м");
        } else
            System.out.println(name + " пробежал: " + distance + " м");

    }
}

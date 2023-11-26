package lessons.lesson5.Task1;

public class Dog implements AnimalAction {
    private String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Dog(String name) {
        this.name = name;
        maxRunDistance = 500;
        maxSwimDistance = 10;
    }

    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println(name + " не может проплыть " + distance + " м");
        } else
            System.out.println(name + " проплыл: " + distance + " м");
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(name + " не может пробежать " + distance + " м");
        } else
            System.out.println(name + " пробежал: " + distance + " м");

    }
}

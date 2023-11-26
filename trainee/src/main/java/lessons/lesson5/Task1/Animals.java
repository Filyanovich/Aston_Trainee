package lessons.lesson5.Task1;

public class Animals implements AnimalAction {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл: " + distance + " м");
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал: " + distance + " м");
    }
}

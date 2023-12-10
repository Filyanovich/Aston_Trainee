package lesson10;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());


        System.out.println("Вес коробки яблок №1: " + appleBox1.getWeight() +
                            "; Количество единиц:" + appleBox1.count());
        System.out.println("Вес коробки яблок №2: " + appleBox2.getWeight() +
                            "; Количество единиц:" + appleBox2.count());
        System.out.println("Вес коробки апельсинов №3: " + orangeBox.getWeight() +
                            "; Количество единиц:" + orangeBox.count());

        System.out.println("\nРавен ли вес коробки с яблоками №1 и №2: " + appleBox1.compare(appleBox2));
        System.out.println("Равен ли вес коробки с яблоками №1 и коробки с апельсинами №3: " + appleBox1.compare(orangeBox));

        System.out.println("\nПереложим яблоки с коробки №1 в коробку №2");
        appleBox1.pourTo(appleBox2);
        System.out.println("Вес коробки яблок №1: " + appleBox1.getWeight());
        System.out.println("Вес коробки яблок №2: " + appleBox2.getWeight());
    }
}

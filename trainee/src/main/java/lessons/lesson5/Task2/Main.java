package lessons.lesson5.Task2;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2, 4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ]");

        System.out.print("Характекристика круга: ");
        circle.printInfo("Желтый", "Черный");

        System.out.print("Характекристика прямоугольника: ");
        rectangle.printInfo("Синий", "Красный");

        System.out.print("Характекристика треугольника: ");
        triangle.printInfo("Белый", "Зеленый");

    }
}

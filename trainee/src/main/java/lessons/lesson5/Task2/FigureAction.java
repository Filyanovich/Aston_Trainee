package lessons.lesson5.Task2;

public interface FigureAction {

    double getPerimetr();

    double getSquare();

    default double circlePerimetr(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    default double rectanflePerimetr(int a, int b) {
        return (a + b) * 2;
    }

    default double trianglePerimetr(int a, int b, int c) {
        return a + b + c;
    }

    default void printInfo(String backgroundColor, String borderColor) {
        String perimetr = String.valueOf(getPerimetr());
        String square = String.valueOf(getSquare());
        String answer = String.join(", ", perimetr, square, backgroundColor, borderColor);
        System.out.println("[" + answer + "]");
    }


}

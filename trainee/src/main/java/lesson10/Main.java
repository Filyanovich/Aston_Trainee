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


        System.out.println("��� ������� ����� �1: " + appleBox1.getWeight() +
                            "; ���������� ������:" + appleBox1.count());
        System.out.println("��� ������� ����� �2: " + appleBox2.getWeight() +
                            "; ���������� ������:" + appleBox2.count());
        System.out.println("��� ������� ���������� �3: " + orangeBox.getWeight() +
                            "; ���������� ������:" + orangeBox.count());

        System.out.println("\n����� �� ��� ������� � �������� �1 � �2: " + appleBox1.compare(appleBox2));
        System.out.println("����� �� ��� ������� � �������� �1 � ������� � ����������� �3: " + appleBox1.compare(orangeBox));

        System.out.println("\n��������� ������ � ������� �1 � ������� �2");
        appleBox1.pourTo(appleBox2);
        System.out.println("��� ������� ����� �1: " + appleBox1.getWeight());
        System.out.println("��� ������� ����� �2: " + appleBox2.getWeight());
    }
}

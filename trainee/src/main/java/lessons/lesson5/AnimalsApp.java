package lessons.lesson5;

public class AnimalsApp {
    public static void main(String[] args) {
        Animals c1 = new Cat("������");
        Animals c2 = new Cat("������");
        Animals c3 = new Cat("�����");

        Animals d1 = new Dog("����");
        Animals d2 = new Dog("�����");

        //�������� ��������
        c1.swim(10);
        c2.run(200);
        d1.swim(2);
        d2.run(100);

        System.out.println("\n������� �����: " + Cat.getCount());
        System.out.println("������� �����: " + Dog.getCount());
        System.out.println("������� ��������: " + Animals.getCount());

    }
}

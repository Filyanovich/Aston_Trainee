package lessons.lesson4;

public class Park {
    private String name;
    private Attraction[] attractions;

    public Park(String name, Attraction[] attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    public void printAttractions() {
        System.out.println("��� �����: " + name);
        for (Attraction attraction : attractions) {
            attraction.printInfo();
            System.out.println("-----------");
        }
    }

    public static class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("�������� �����������: " + name);
            System.out.println("����� ������: " + workingHours);
            System.out.println("���������: " + cost);
        }
    }

    public static void main(String[] args) {
        Attraction[] attractions = new Attraction[3];
        attractions[0] = new Attraction("������ ���������", "10.00-18.00", 5);
        attractions[1] = new Attraction("��������", "10.00 - 17.00", 5);
        attractions[2] = new Attraction("�������", "11.00 - 15.00", 8);

        Park amusementPark = new Park("Happyland", attractions);
        amusementPark.printAttractions();
    }
}

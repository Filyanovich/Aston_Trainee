package lesson6;

public class Main {
    public static void main(String[] args) {
        String fileName = "data.csv";
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int data[][] = {{1, 2, 3}, {100, 200, 300}, {1000, 2000, 3000}};
        AppData.saveDate(fileName, headers, data);
        int[][] loadedData = AppData.loadDate(fileName);
        for (int i = 0; i < loadedData.length; i++) {
            for (int j = 0; j < loadedData[i].length; j++) {
                System.out.print(loadedData[i][j] + "; ");
            }
            System.out.println();
        }

    }
}

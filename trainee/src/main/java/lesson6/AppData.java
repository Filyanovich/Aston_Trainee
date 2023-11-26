package lesson6;

import java.io.*;
import java.util.Arrays;

public class AppData {

    public static void saveDate(String file, String[] headers, int[][] data) {
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < headers.length; i++) {
                writer.write(headers[i]);
                if (i < headers.length - 1) {
                    writer.write(";");
                }
            }
            writer.write("\n");


            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(Integer.toString(data[i][j]));
                    if (j < data[i].length - 1) {
                        writer.write(";");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[][] loadDate(String file) {
        int[][] data = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String line=reader.readLine();
            String[] headers = reader.readLine().split(";");

            int numColumns = headers.length;
            int numRows = 0;
            while ((reader.readLine()) != null) {
                numRows++;
            }
            data = new int[numRows][numColumns];

            reader.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(file));
            reader2.readLine();

            System.out.println(Arrays.toString(headers));
            for (int i = 0; i < numRows; i++) {
//              String  line=reader.readLine();
                String[] values = reader2.readLine().split(";");
                for (int j = 0; j < numColumns; j++) {
                    data[i][j] = Integer.parseInt(values[j]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileExample {
    public static void main(String[] args) {
        String inputFilePath = "Src/subject.txt";
        String outputFilePath = "Src/newSubject.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Reading from subject.txt
            br = new BufferedReader(new FileReader(inputFilePath));
            bw = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = br.readLine()) != null) {
                // Writing each line to newSubject.txt
                bw.write(line);
                bw.newLine(); // To ensure each line is written in the same format as it was read
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close BufferedReader
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // Close BufferedWriter
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

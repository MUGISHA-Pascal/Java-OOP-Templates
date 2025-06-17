import java.io.*;

public class FileIOHelper {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("This is a sample file write operation.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
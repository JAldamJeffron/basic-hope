import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWriter");
            writer.newLine();
            writer.write("Write using FileWriter");
            writer.newLine();
            writer.write("Write using FileWriter");
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Some error thrown......");
            System.out.println(e);
        }
    }
}

import java.io.*;

class FileExample {
    public static void main(String[] args) {
        File newFile = new File("test.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

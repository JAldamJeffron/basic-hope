import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("student.txt");
        ObjectInputStream obj = new ObjectInputStream(fi);
        while (true) {
            try {
                Student s = (Student) obj.readObject();
                System.out.println(s.name + " " + s.mark);
            } catch (EOFException e) {
                break;
            }
        }
    }
}
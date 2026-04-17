import java.io.*;

class Student implements Serializable {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

class CustomObjectOutputStream extends ObjectOutputStream {
    CustomObjectOutputStream(OutputStream obj) throws IOException {
        super(obj);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}

public class SerializableEg {
    public static void main(String[] args) throws IOException {
        Student s = new Student("Bob", 777);
        File file = new File("student.txt");
        FileOutputStream fo = new FileOutputStream(file, true);
        ObjectOutputStream obj;
        if (file.length() == 0) {
            obj = new ObjectOutputStream(fo);
        } else {
            obj = new CustomObjectOutputStream(fo);
        }
        obj.writeObject(s);
    }
}
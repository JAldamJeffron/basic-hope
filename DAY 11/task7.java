
interface DocumentActions {
    void open();
    void save();
    void close();
    void process();
}

abstract class Document implements DocumentActions {

    private String name;
    private int size;

    public Document(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void getName() {
        System.out.println(name +" Of Size "+size);
    }

    public void open() {
        System.out.println("Opening " + name);
    }

    public void save() {
        System.out.println("Saving " + name);
    }

    public void close() {
        System.out.println("Closing " + name);
    }

    public abstract void process();
}

class TextDoc extends Document {
    public TextDoc(String name, int size) {
        super(name, size);
    }

    public void process() {
        System.out.print("Showing text content: " );
        getName();
    }
}

class ImageDoc extends Document {
    public ImageDoc(String name, int size) {
        super(name, size);
    }

    public void process() {
        System.out.print("Rendering image: ");
        getName();
    }
}

class SpreadsheetDoc extends Document {
    public SpreadsheetDoc(String name, int size) {
        super(name, size);
    }

    public void process() {
        System.out.println("Calculating cells: " );
        getName();
    }
}

public class task7 {
    public static void main(String[] args) {

        Document[] docs = {new TextDoc("file.txt", 10),new ImageDoc("photo.png", 20),new SpreadsheetDoc("data.xlsx", 30)};

        for (Document doc : docs) {
        	doc.open();
            doc.process();
            doc.save();
            doc.close();
            System.out.println();
            doc.getName();
            System.out.println();
        }
    }
}
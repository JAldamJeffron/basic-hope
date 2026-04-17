class SampleThread extends Thread {
    String name;

    SampleThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class ConcurrencyeEx {
    public static void main(String[] args) {
        SampleThread s1 = new SampleThread("TASK1");
        SampleThread s2 = new SampleThread("TASK2");
        s1.start();
        s2.start();
    }
}
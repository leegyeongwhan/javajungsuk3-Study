package JavaJungSuk3_Study.Example.ch13;


public class ThreadEx8 {
    public static void main(String[] args) throws Exception {
        ThreadEx8_1 t1 = new ThreadEx8_1();
        ThreadEx8_2 t2 = new ThreadEx8_2();

        t2.setPriority(9);
        System.out.println("t1(-) = " + t1.getPriority());
        System.out.println("t2(|) = " + t2.getPriority());
        t1.start();
        t2.start();
    }
}


class ThreadEx8_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("-");
            for (int x = 0; x < 1000000; x++) ;
        }
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("|");
            for (int x = 0; x < 1000000; x++) ;
        }
    }
}
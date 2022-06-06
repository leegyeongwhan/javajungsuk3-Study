package JavaJungSuk3_Study.Example.ch13;

public class ThreadEx5 {
    static long starTime = 0;

    public static void main(String[] args) throws Exception {

        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();
        starTime = System.currentTimeMillis();
        //하나의 스레드System.currentTimeMillis();
        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.println("소요시간1:" + (System.currentTimeMillis() - starTime));


    }
}

class ThreadEx5_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.printf("%s ", new String("|"));

        System.out.println("소요시간2:" + (System.currentTimeMillis() - ThreadEx5.starTime));
    }
}
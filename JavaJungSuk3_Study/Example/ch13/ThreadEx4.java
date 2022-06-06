package JavaJungSuk3_Study.Example.ch13;

public class ThreadEx4 {
    public static void main(String[] args) throws Exception {
        long starTime = System.currentTimeMillis();
        //하나의 스레드
        for (int i = 0; i < 300; i++)
            System.out.println("new String(\"-\") = " + new String("-"));

        System.out.println("소요시간1:" + (System.currentTimeMillis() - starTime));

        for (int i = 0; i < 300; i++)
            System.out.println("new String(\"|\") = " + new String("|"));

        System.out.println("소요시간2:" + (System.currentTimeMillis() - starTime));

        }
    }

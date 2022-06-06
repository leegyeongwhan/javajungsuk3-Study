package JavaJungSuk3_Study.Example.ch13;

import javax.swing.*;

public class ThreadEx7 {
    public static void main(String[] args) throws Exception {
        ThreadEx7_1 e = new ThreadEx7_1();
        e.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("input = " + input);
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
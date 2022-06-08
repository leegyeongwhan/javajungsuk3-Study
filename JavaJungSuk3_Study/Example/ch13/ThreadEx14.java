package JavaJungSuk3_Study.Example.ch13;//package JavaJungSuk3_Study.Example.ch13;

import javax.swing.*;

public class ThreadEx14 {
    public static void main(String[] args) throws Exception {
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("입력하신값은" + input);
        th1.interrupt();
        System.out.println("th1.isInterrupted() = " + th1.isInterrupted());
    }
}

class ThreadEx14_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                interrupt();
            }
        }
        System.out.println("카운트가 종료되었습니다");
    }
}
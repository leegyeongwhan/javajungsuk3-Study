package JavaJungSuk3_Study.Example.ch13;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class ThreadEx6 {

    public static void main(String[] args) throws Exception {
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("input = " + input);
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

package JavaJungSuk3_Study.Example.ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myid", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" id와pwd를 입력해주세요");
            System.out.println("id:");
            String id = scanner.nextLine().trim();

            System.out.println("pwd:");
            String pwd = scanner.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("id가존재하지않습니다 다시입력해주세요");
                continue;
            } else {
                if (!(map.get(id).equals(pwd))) {
                    System.out.println("비밀번호가 일치하지않습니다");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다");
                    break;
                }
            }
        }
    }
}

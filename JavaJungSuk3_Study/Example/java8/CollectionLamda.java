package JavaJungSuk3_Study.Example.java8;

import java.util.*;

public class CollectionLamda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(i -> System.out.print(i + ",")); //consumer
        System.out.println();

        //람다로하면 코드의 양을 매우 줄일수 있다.
//        Iterator it = list.listIterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        System.out.println();
    }
}

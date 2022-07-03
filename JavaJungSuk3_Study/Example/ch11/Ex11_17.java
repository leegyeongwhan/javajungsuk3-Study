package JavaJungSuk3_Study.Example.ch11;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("김자바", 90);
        map.put("이자바", 100);
        map.put("박자바", 100);
        map.put("동자바", 80);

        Set set = map.entrySet();

        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("이름= " + e.getKey() + "점수= " + e.getValue());
        }
        set = map.keySet();

        System.out.println(set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = (int) it.next();
            total += i;
        }
        System.out.println(total);
        Collections.max(values);
        Collections.min(values);

    }
}

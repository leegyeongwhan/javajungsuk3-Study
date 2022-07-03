package JavaJungSuk3_Study.Example.ch11;

import java.util.*;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet(new TestComp());
        // Set set = new HashSet();
        for (int i = 0; i < set.size(); i++) {
            int num = (int) (Math.random() * 45) + 1;
        }
        set.add(new Test());

        System.out.println("set = " + set);

    }
}
////비교할 클래스가 정렬 기준을 가지고있떤가 Compartor 를 상속받아 구현하던가
class Test implements Comparable {

    @Override
    public int compareTo(Object o) {
        return -1;
    }
}

//정렬기준을 정해줘야함 TreeSet에다
class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}

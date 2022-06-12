package JavaJungSuk3_Study.Example.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14Stream_01 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream();
//        intStream.forEach(System.out::print);
//
//        intStream = list.stream();
//        intStream.forEach(System.out::print);
//
//        Stream<String> strStream = Stream.of("a", "b", "C");

        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
        intStream1.forEach(System.out::println);
        System.out.println(intStream1.sum());
        System.out.println(intStream1.average());
        System.out.println(intStream1.count());
        //속도 더빠르고 여러메서드들을 다룰수있다

        Integer[] intArr1 = {1,2,3,4,5};
        Stream<Integer> integerStream = Arrays.stream(intArr1);
        integerStream.forEach(System.out::println);

    }
}

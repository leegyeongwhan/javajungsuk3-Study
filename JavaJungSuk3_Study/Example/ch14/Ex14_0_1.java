package JavaJungSuk3_Study.Example.ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_1 {
    public static void main(String[] args) {
//        //IntStream intStream = new Random().ints();
//        IntStream intStream = new Random().ints(10, 5, 10);
//        intStream
//                //   .limit(5)
//                .forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(0, n -> n + 2);
        iterate.limit(10).forEach(System.out::println);

        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(System.out::println);
    }
}

package JavaJungSuk3_Study.Example.ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "JAVA", "Lamda", "stream"
                , "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
        System.out.println("===============");
        Stream.of(strArr).parallel().forEach(System.out::println);
        // Stream.of(strArr).parallel().forEachOrdered(System.out::println);

        boolean nonEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        System.out.println("===============");
        System.out.println(nonEmptyStr);

        Optional<String> sWord = Stream.of(strArr).parallel().filter(s -> s.charAt(0) == 's').findAny();
        System.out.println("===============");
        System.out.println(sWord);


        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);
        OptionalInt max = intStream3.reduce((a, b) -> Integer.max(a, b));
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println("==============");
        System.out.println(count);
        System.out.println(sum);
        System.out.println(max.orElse(0));
        System.out.println(min.orElse(0));
    }
}

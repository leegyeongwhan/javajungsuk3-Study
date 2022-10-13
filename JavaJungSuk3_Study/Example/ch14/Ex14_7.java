package JavaJungSuk3_Study.Example.ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> streamArrStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "DEF", "JKL"}
        );

        //Stream<String> stringStream = streamArrStream.flatMap(array -> Arrays.stream(array));
        Stream<String> stringStream = streamArrStream.flatMap(Arrays::stream);

        stringStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Belive or not It it true",
                "DO or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}

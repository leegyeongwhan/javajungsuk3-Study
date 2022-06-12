package JavaJungSuk3_Study.Example.ch14;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt"),
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)    //Stream<File> 에서 Stream<String> 으로변환
                .filter(s -> s.indexOf('.') != -1)
                .peek(s -> System.out.printf("flesname=%s%n", s))
                .map(s -> s.substring(s.indexOf('.') + 1))   //확장잠나 추출
                .peek(s -> System.out.printf("확장자=%s%n", s))
                .map(String::toUpperCase)      //모두 대문자로 변환
                .distinct()                     //중복제거
                .forEach(System.out::println);
        System.out.println();
    }
}

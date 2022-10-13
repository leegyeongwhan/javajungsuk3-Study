package JavaJungSuk3_Study.Example.ch14;

import java.util.Comparator;

import java.util.stream.Stream;

public class Ex14_5 {
    public static void main(String[] args) {
        Stream<Student1> studentStream = Stream.of(
                new Student1("이자바", 3, 300),
                new Student1("김자바", 1, 200),
                new Student1("안자바", 2, 100),
                new Student1("박자바", 2, 150),
                new Student1("소자바", 1, 200),
                new Student1("나자바", 3, 290),
                new Student1("감자바", 3, 180)
        );
        //Student1::getBan
        //(Student1 student1) -> student1.getBan()
        //Comparator.comparing((Student1 student1) -> {
        //                            return student1.getBan();
        //
        studentStream.sorted(Comparator.comparing(Student1::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student1 implements Comparable<Student1> {
    String name;
    int ban;
    int totalScore;

    public Student1(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return o.totalScore - this.totalScore;
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }
}

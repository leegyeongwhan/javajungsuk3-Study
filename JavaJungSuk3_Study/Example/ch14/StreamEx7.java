//package JavaJungSuk3_Study.Example.ch14;
//
//import java.util.*;
//import java.util.stream.Stream;
//
//class Student1 {
//    String name;
//    boolean isMale;
//    int hak;
//    int ban;
//    int score;
//
//    public Student1(String name, boolean isMale, int hak, int ban, int score) {
//        this.name = name;
//        this.isMale = isMale;
//        this.hak = hak;
//        this.ban = ban;
//        this.score = score;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isMale() {
//        return isMale;
//    }
//
//    public int getHak() {
//        return hak;
//    }
//
//    public int getBan() {
//        return ban;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    @Override
//    public String toString() {
//        return "Student1{" +
//                "name='" + name + '\'' +
//                ", isMale=" + isMale +
//                ", hak=" + hak +
//                ", ban=" + ban +
//                ", score=" + score +
//                '}';
//    }
//
//    enum Level {HIGH, MID, LOW}
//}
//
//public class StreamEx7 {
//    public static void main(String[] args) {
//        Student1[] stuArr = {
//                new Student1("나자바", true, 1, 1, 300),
//                new Student1("김지미", false, 1, 1, 250),
//                new Student1("김자바", true, 1, 1, 200),
//                new Student1("이지미", false, 1, 2, 150),
//                new Student1("남자바", true, 1, 2, 100),
//                new Student1("안지미", false, 1, 2, 50),
//                new Student1("황지미", false, 1, 3, 100),
//                new Student1("강지미", false, 1, 3, 150),
//                new Student1("이자바", true, 1, 3, 200),
//        };
//        System.out.printf("1 단순분할 성별로분할%n");
//        Map<Boolean, List<Student1>> stuBySex = Stream.of(stuArr).collect(pa)
//
//    }
//}

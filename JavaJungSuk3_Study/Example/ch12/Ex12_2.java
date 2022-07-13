package JavaJungSuk3_Study.Example.ch12;

import java.util.HashMap;

public class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); //뒤에 생성자 지네릭스는 생략가능
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));


        Student s = map.get("자바왕");
        Student s1 = (Student) map.get("자바왕"); //지네릭스를 씀으로서 sudent생략가능
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

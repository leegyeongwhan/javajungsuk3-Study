package JavaJungSuk3_Study;

import java.util.ArrayList;

public class Student {
  String name = ""; //학생이름
  int ban = 0;  //반
  int no = 0;
  int kor = 0;
  int eng = 0;
  int math = 0;


  int getTotal() {
    return (kor + eng + math);
  }


  float getAverage() {
    float gap = ((float) getTotal() / 3);
    // System.out.println(gap);
    gap = (float) (Math.round(gap * 10) / 10.0);
    return gap;
  }

  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  Student() {
  }

  ArrayList list = new ArrayList();

  private void info() {
    list.add(this.name);
    list.add(this.ban);
    list.add(this.no);
    list.add(this.kor);
    list.add(this.eng);
    list.add(this.math);
    list.add(this.getTotal());
    list.add(this.getAverage());

    
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
    }

    return ;
  }

  public static void main(String[] args) {
//    Student s = new Student();
//    s.name = "홍길동";
//    s.ban = 1;
//    s.no = 1;
//    s.kor = 100;
//    s.eng = 60;
//    s.math = 76;
//
//    System.out.println("이름" + s.name);
//    System.out.println("총점" + s.getTotal());
//    System.out.println("평균" + s.getAverage());
    Student s = new Student("홍길동", 1, 1, 100, 60, 70);
    s.info();
  }
}

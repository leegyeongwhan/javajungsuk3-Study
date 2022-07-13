package JavaJungSuk3_Study.Exercise;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated  // 하위호환성
@SuppressWarnings("1111")  //경고억제
@TestInfo(testBy = "aaa", testDate = @DateTime(yymmdd = "220513", hhmmss = "235959"))
public class AnnotationEx5 {
  public static void main(String[] args) {
    Class<AnnotationEx5> cls = AnnotationEx5.class;
    TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
    System.out.println("anno.testby()=" + anno.testBy());
    System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
    System.out.println("anno.testDate()=" + anno.testDate().hhmmss());
    for (String str : anno.testTools()) {
      System.out.println("testTools=" + str);
    }
    System.out.println();
    Annotation[] annoArr = cls.getAnnotations();

    for (Annotation a: annoArr){
      System.out.println(a);
    }
  }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
  int count() default 1;

  String testBy();

  String[] testTools() default "JUnit";

  TestType testType() default TestType.FIRST;

  DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
  String yymmdd();

  String hhmmss();
}

enum TestType {FIRST, FINAL}

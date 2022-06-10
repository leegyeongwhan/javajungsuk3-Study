package JavaJungSuk3_Study.Example.ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {

        // 입려받는 갑이없는 서플라이
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//        // Function<String, Integer> f = (String s) -> 클래스 이름 :: 메서드 이름;
//        Function<String, Integer> ft = Integer::parseInt;
//
//        System.out.println(f.apply("100") + 200);


        //입력받는 값이잇는 펑션
        //Function<Integer,String> f = () -> new MyClass();
        //Function<Integer,String> f = (String s) -> 클래스 이름::메서드 이름;

        Supplier<MyClass> s = () -> new MyClass();
        MyClass mc = s.get();
        System.out.println(mc);
        System.out.println(s.get());
    }
}

class MyClass {
}

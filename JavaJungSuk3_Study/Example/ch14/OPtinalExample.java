package JavaJungSuk3_Study.Example.ch14;

import java.util.Optional;

public class OPtinalExample {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = new int[0];

        //   Optional<String> opt = Optional.empty();
        Optional<String> opt = Optional.of("abc");
        System.out.println("opt" + opt);
        //   System.out.println(opt.get()); 에러

        String str = "";

        //opt값이 널이면 orelse안의 값을 반환
        str = opt.orElse("EMPTY");
//      str = opt.orElseGet(String::new);
//      str = opt.orElseGet(() -> new String());
        System.out.println("str = " + str);


    }
}

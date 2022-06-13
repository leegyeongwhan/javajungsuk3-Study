package JavaJungSuk3_Study.Example.ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> opStr = Optional.of("abcde");
        Optional<Integer> opInt = opStr.map(String::length);
        System.out.println("opStr = " + opStr.get());
        System.out.println("opInt = " + opInt.get());

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();
        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3=%d%n",x));
        OptionalInt optinal1 = OptionalInt.of(0 );
        OptionalInt optinal2 = OptionalInt.empty();

        System.out.println("optinal1.isPresent() = " + optinal1.isPresent());
        System.out.println("optinal2.isPresent() = " + optinal2.isPresent());

        Optional<String> opt  = Optional.ofNullable(null);
        Optional<String> opt2  = Optional.empty();

        System.out.println("opt = " + opt);
        System.out.println("opt2 = " + opt2);
        System.out.println("opt.equals(opt2) = " + opt.equals(opt2));
    }
}

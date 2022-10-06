package JavaJungSuk3_Study.Example.ch14;

public class Ex14_lamda {
    public static void main(String[] args) {
//        MyFucnction2 f = new MyFucnction2() {
//            @Override
//            public int max(int a, int b) {
//                return 0;
//            }
//        };


        MyFucnction2 f = (a, b) -> a > b ? a : b;
        int value = f.max(1, 2);
    }
}


@FunctionalInterface
interface MyFucnction2 {
    public abstract int max(int a, int b);
}

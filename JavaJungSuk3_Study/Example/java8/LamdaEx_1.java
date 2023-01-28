package JavaJungSuk3_Study.Example.java8;

public class LamdaEx_1 {
    public static void main(String[] args) {

        new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };
    }
}

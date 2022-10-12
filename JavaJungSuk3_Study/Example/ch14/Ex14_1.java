package JavaJungSuk3_Study.Example.ch14;

@FunctionalInterface
interface MyFuntion {
    void run();
}

public class Ex14_1 {
    static void execute(MyFuntion f) {
        f.run();
    }

    static MyFuntion getFunction() {
        MyFuntion f = () -> System.out.println("f3run");
        return f;
    }

    public static void main(String[] args) {
        MyFuntion f1 = () -> System.out.println("f1.run ");

        MyFuntion f2 = new MyFuntion() {
            @Override
            public void run() {
                System.out.println("f2.run");
            }
        };

        MyFuntion f3 = getFunction();
        f1.run();
        f2.run();
        f3.run();
    }
}

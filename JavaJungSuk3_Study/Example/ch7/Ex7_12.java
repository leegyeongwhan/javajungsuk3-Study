package JavaJungSuk3_Study.Example.ch7;

public class Ex7_12 {
    class InstaccneInner {
        int iv = 100;
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;

    }

    void myMethd() {
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstaccneInner.CONST);
        System.out.println(StaticInner.cv);
    }
}


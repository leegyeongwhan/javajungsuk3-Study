package JavaJungSuk3_Study.Exercise;

class Exercise9_8 {
    /*
    (1) round . 메서드를 작성하시오
    */

    public static double round(double d, int n) {
        System.out.println("Math.pow(10,n) = " + Math.pow(10, n));
        System.out.println("d * Math.pow(10, n) = " + d * Math.pow(10, n));
        return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415, 1));
        System.out.println(round(3.1415, 2));
        System.out.println(round(3.1415, 3));
        System.out.println(round(3.1415, 4));
        System.out.println(round(3.1415, 5));
    }
}
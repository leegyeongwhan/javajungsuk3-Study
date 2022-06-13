package JavaJungSuk3_Study.Exercise;

public class Exercise9_9 {


    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> "
                + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> "
                + delChar("(1 2 3 4\t5)", " \t"));
    }

    /*
 (1) delChar . 메서드를 작성하시오
 */
    private static String delChar(String s, String s1) {
        StringBuffer st = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s1.indexOf(ch) == -1) {
                st.append(ch);
            }
        }
        return st.toString();
    }

}

package JavaJungSuk3_Study.Exercise.ch9;

class Exercise9_7 {
    /*
    (1) contains . 메서드를 작성하시오
    */
    static boolean contains(String src, String target) {
        boolean check = false;
//        for (int i = 0; i < src.length(); i++) {
//            int j = 0;
//            if (src.charAt(i) == target.charAt(j))
//                for (; j < target.length(); j++) {
//                    if (src.charAt(i) == target.charAt(j)) {
//                        if (j == target.length() - 1) return true;
//                        i++;
//                        continue;
//                    } else {
//                        break;
//                    }
//                }
//        }

        return src.indexOf(target) != -1;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
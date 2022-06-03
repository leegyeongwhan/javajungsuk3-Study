package JavaJungSuk3_Study.Exercise;

class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch) {
/*
(1) printGraph . 메서드를 작성하시오

*/
        int[] arr = dataArr;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print(ch);
            }
            System.out.print(arr[i]);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}

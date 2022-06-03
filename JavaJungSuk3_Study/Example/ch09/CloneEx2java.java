package JavaJungSuk3_Study.Example.ch09;

import java.util.Arrays;

class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}

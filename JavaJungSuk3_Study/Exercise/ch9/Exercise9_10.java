package JavaJungSuk3_Study.Exercise.ch9;

public class Exercise9_10 {
    /*
(1) format . 메서드를 작성하시오
1. length str length . 의 값이 의 길이보다 작으면 만큼만 잘라서 반환한다
2. 1 , length char . 의 경우가 아니면 크기의 배열을 생성하고 공백으로 채운다
3. (alignment) (str) . 정렬조건 의 값에 따라 문자열 을 복사할 위치를 결정한다
(System.arraycopy() ) 사용
4. 2 char . 에서 생성한 배열을 문자열로 만들어서 반환한다
*/
    static String format(String str, int length, int alignmet) {
        int diff = length - alignmet;
        if (diff < 0) {
            return str.substring(0, length);
        }
        char[] sorce = str.toCharArray();
        char[] chArr = new char[length];
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = ' ';
        }
        switch (alignmet) {
            case 0:
            default:
                System.arraycopy(sorce, 0, chArr, 0, sorce.length);
                break;
            case 1:
                System.arraycopy(sorce, 0, chArr, diff / 2, sorce.length);
                break;
            case 2:
                System.arraycopy(sorce, 0, chArr, diff, sorce.length);
                break;
        }
        return new String(chArr);
    }


    public static void main(String[] args) {
        String str = "  가나다";
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}

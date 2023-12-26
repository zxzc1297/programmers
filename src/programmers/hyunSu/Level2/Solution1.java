package programmers.hyunSu.Level2;

import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 *
 * 제한 조건
 * s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
 */
public class Solution1 {

    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ");
        int min = 0;
        int max = 0;

        for(int i=0; i<list.length; i++){
            if(i==0){
                min = Integer.valueOf(list[i]);
                max = Integer.valueOf(list[i]);
            } else {
                min = Math.min(min,Integer.valueOf(list[i]));
                max = Math.max(max,Integer.valueOf(list[i]));
            }
        }
        answer = String.valueOf(min) + " " + String.valueOf(max);

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public String getMinMaxString(String str) {

        String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(arrayInt);
        String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];

        return result;

    }
}

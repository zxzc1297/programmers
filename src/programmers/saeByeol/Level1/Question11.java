package programmers.saeByeol.Level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 정수 내림차순으로 배치하기
 *
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 */
public class Question11 {

    //라이브러리 사용하지 않고 풀기
    public long solution(long n) {
        String answer = "";
        String str = n + "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] < chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        for (char aChar : chars) {
            answer += aChar;
        }
        return new Long(answer);
    }

    //라이브러리 사용하고 풀기 import 해주기 : import java.util.*;
    public long solution2(long n) {
        String answer = "";
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        for (String a : arr) {
            answer += a;
        }
        return new Long(answer);
    }

    public static void main(String[] args) {
        Question11 question11 = new Question11();
        long solution = question11.solution2(118372);
        System.out.println("solution = " + solution);
    }
}

package programmers.hyunSu.Level1.sol21_30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 */
public class Solution25 {

    public String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for(int i=chars.length-1; i>=0; i--){
            answer += chars[i];
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public String reverseStr(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
    public String reverseStr2(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}

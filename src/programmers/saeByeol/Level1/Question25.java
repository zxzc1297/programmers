package programmers.saeByeol.Level1;

import java.util.Arrays;

/**
 * 문자열 내림차순으로 배치하기
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 */
public class Question25 {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray(); //문자열을 문자 배열로 만드는 라이브러리
        int[] nArr = new int[s.length()];
        Arrays.sort(chars);
        for (int i = 0; i < s.length(); i++) {
            nArr[s.length() - 1 - i] = chars[i] - 48;
        }
        for (int n : nArr) {
            answer += (char) (n + '0');
        }
        return answer;
    }

    public static void main(String[] args) {
        Question25 question25 = new Question25();
        String zbcdefg = question25.solution("Zbcdefg");
        System.out.println("zbcdefg = " + zbcdefg);
    }

    /**
     * 다른사람의 풀이
     */
    public String reverseStr(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString(); //StringBuilder 의  reverse 기능 사용, toString() 을 이용하여 자 배열을 문자열로 만들기
                                                                        //이외의 문자 배열을 문자열로 만들기 String.valueOf(문자 배열)
    }
}

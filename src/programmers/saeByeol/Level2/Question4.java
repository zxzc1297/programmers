package programmers.saeByeol.Level2;
import java.util.*;

/**
 * 올바른 괄호
 * 문제 설명
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
 *
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 문자열 s의 길이 : 100,000 이하의 자연수
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 */
public class Question4 {
    /**
     * 효율성 테스트 실패
     * @param s
     * @return
     */
    boolean solution(String s) {
        boolean answer = true;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
            if (list.size() > 1) {
                for (int j = 1; j < list.size(); j++) {
                    if ((list.get(j - 1) + list.get(j)).equals("()")) {
                        list.remove(j);
                        list.remove(j - 1);
                        j = 1;
                    }
                }
            }
        }

        if (list.size() > 0) answer = false;
        return answer;
    }

    /**
     * 다른 사람 풀이
     * @param s
     * @return
     */
    boolean solution2(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        return false;
    }
}

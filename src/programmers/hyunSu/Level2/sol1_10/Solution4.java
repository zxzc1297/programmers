package programmers.hyunSu.Level2.sol1_10;

/**
 * 문제 설명
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
 *
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고,
 * 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 문자열 s의 길이 : 100,000 이하의 자연수
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 */
public class Solution4 {

    boolean solution(String s) {
        int left = 0;
        int right = 0;

        if(s.substring(s.length()-1, s.length()).equals("("))
            return false;

        char[] chars = s.toCharArray();

        for(char c : chars){
            if(left - right < 0)
                return false;

            if(c == '(')
                left += 1;
            else if(c == ')')
                right += 1;
        }

        if(left == right)
            return true;
        else
            return false;
    }

    /**
     * 다른 사람 풀이
     */
    boolean solution2(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}

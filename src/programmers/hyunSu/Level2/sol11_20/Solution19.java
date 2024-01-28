package programmers.hyunSu.Level2.sol11_20;

import java.util.*;
/**
 * 문제 설명
 * 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
 *
 * (), [], {} 는 모두 올바른 괄호 문자열입니다.
 * 만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다.
 * 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
 * 만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다.
 * 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
 * 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
 * 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때
 * s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * s의 길이는 1 이상 1,000 이하입니다.
 */
public class Solution19 {

    //"[{]}" 이 반례 해결 못함
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            if(i>0)
                s = s.substring(1,s.length()) + s.substring(0,1);
            int count1=0;
            int count2=0;
            int count3=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == '('){
                    count1++;
                }
                if(s.charAt(j) == ')'){
                    count1--;
                }
                if(s.charAt(j) == '{'){
                    count2++;
                }
                if(s.charAt(j) == '}'){
                    count2--;
                }
                if(s.charAt(j) == '['){
                    count3++;
                }
                if(s.charAt(j) == ']'){
                    count3--;
                }
                if(count1 < 0 || count2 < 0 || count3 < 0){
                    break;
                }
            }

            if(count1 == 0 && count2 == 0 && count3 == 0){
                answer++;
            }
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    private final Stack<Character> stack = new Stack<>();

    public int solution2(String s) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(stringBuilder.charAt(0));
            stringBuilder.deleteCharAt(0);
            if (correctParenthesis(stringBuilder.toString().toCharArray()))
                answer++;
        }
        return answer;
    }

    private boolean correctParenthesis(char[] s) {
        for (char c : s) {
            if (!(check(c, '(', ')') && check(c, '[', ']') && check(c, '{', '}')))
                return false;
        }
        return stack.isEmpty();
    }

    private boolean check(char c, char a, char b) {
        if (c == a)
            stack.push(a);
        else if (c == b)
            if (!stack.isEmpty() && stack.peek() == a) stack.pop(); else return false;
        return true;
    }

    public int solution3(String s) {
        int answer = 0;
        int strLen = s.length();

        for(int i = 0; i < strLen; i++)
            answer += cal(s, i, strLen);

        return answer;
    }

    public int cal(String s, int strtIdx, int strLen){
        int ret = 0;
        Stack<Character> st = new Stack<>();

        for(int i = strtIdx; i < strtIdx + strLen; i++){
            int idx = i % strLen;
            char c = s.charAt(idx);

            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(st.empty())
                    return 0;
                else if((st.peek() != '(' && c == ')') || (st.peek() != '{' && c == '}') || (st.peek() != '[' && c == ']'))
                    return 0;
                else
                    st.pop();
            }
        }

        if(!st.empty())
            return 0;

        return 1;
    }
}

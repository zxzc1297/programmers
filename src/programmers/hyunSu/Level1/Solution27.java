package programmers.hyunSu.Level1;

/**
 * 문제 설명
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 *
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 */
public class Solution27 {
    /**
     * 실무에서 이렇게 하면 큰일남..?
     */
    public boolean solution(String s) {
        boolean answer = false;
        try{
            int rt = Integer.valueOf(s);
            if(s.length() == 4 || s.length() == 6){
                answer = true;
            }
        }catch(Exception e){
            return false;
        }
        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public boolean solution2(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }

    public boolean solution3(String s) {
        int length = s.length();
        if (length != 4 && length != 6)
            return false;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
                return false;

        }
        return true;
    }
}

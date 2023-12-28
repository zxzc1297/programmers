package programmers.saeByeol.Level2;

/**
 * JadenCase 문자열 만들기
 * 문제 설명
 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
 * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 1 이상 200 이하인 문자열입니다.
 * s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
 * 숫자는 단어의 첫 문자로만 나옵니다.
 * 숫자로만 이루어진 단어는 없습니다.
 * 공백문자가 연속해서 나올 수 있습니다.
 */
public class Question2 {
    public String solution(String s) {
        s = s.toLowerCase();
        String firstStr =  s.substring(0, 1).toUpperCase();
        s = firstStr + s.substring(1);
        for (int i = 1; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if (i + 1 != s.length() && str.equals(" ")) {
                String before = s.substring(0, i + 1);
                String after = s.substring(i + 2);
                String upperStr = s.substring(i + 1, i + 2).toUpperCase();
                s = before + upperStr + after;
            }
        }
        return s;
    }

    public String solution2(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}

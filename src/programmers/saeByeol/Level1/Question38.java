package programmers.saeByeol.Level1;

/**
 *시저 암호
 * 문제 설명
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 *
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 */
public class Question38 {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c != ' ') {
                //A:113, Z:138, a:145, z:170
                int num = c + 48 + n;
                if (c >= 'A' && c <= 'Z') {
                    num = (num > 138) ? num - 26 : num;
                } else if (c >= 'a' && c <= 'z') {
                    num = (num > 170) ? num - 26 : num;

                }
                c = (char)(num - '0');
            }
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Question38 question38 = new Question38();
        String aAzZ = question38.solution("abcdefghijklmnopqrstuvwxyz", 1);
        System.out.println("dfaHE = " + aAzZ); //bcdefghijklmnopqrstuvwxyza
    }
}

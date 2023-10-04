package programmers.saeByeol.Level1;

/**
 * 가운데 글자 가져오기
 *
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class Question21 {
    public String solution(String s) {
        int i = s.length() / 2;
        String answer = (s.length() % 2 == 0) ? s.substring(i - 1, i + 1) : s.substring(i, i + 1);
        return answer;
    }

    public static void main(String[] args) {
        Question21 question21 = new Question21();
        String abcde = question21.solution("qwerasdaf");
        System.out.println("abcde = " + abcde);
    }
}

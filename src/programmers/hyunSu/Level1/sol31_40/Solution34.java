package programmers.hyunSu.Level1.sol31_40;

/**
 * 문제 설명
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 *
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */
public class Solution34 {

    public String solution(String s) {
        String answer = "";
        int cnt = 2;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals(" ")){
                cnt = 2;
                answer += " ";
            }else{
                if(cnt % 2 == 0){
                    answer += s.substring(i,i+1).toUpperCase();
                    cnt++;
                }else{
                    answer += s.substring(i,i+1).toLowerCase();
                    cnt++;
                }
            }
        }
        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public String solution2(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}

package programmers.hyunSu.Level1.sol1_10;

/**
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class Solution7 {

    public int[] solution(long n) {
        int[] answer = {};
        String num = Long.toString(n);
        answer = new int[num.length()];

        for(int i = 0; i<num.length(); i++){
            answer[num.length()-i-1] = Integer.valueOf(num.substring(i, i+1));
        }

        return answer;
    }
}

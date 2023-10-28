package programmers.saeByeol.Level1;

/**
 * 소수 찾기
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 *
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 *
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 */
public class Question55 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            Boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        return answer;
    }

    /**
     * 다른사람의 풀이
     */
}

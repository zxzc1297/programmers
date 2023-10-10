package programmers.saeByeol.Level1;

/**
 * 최대공약수와 최소공배수
 * 문제 설명
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 *
 * 제한 사항
 * 두 수는 1이상 1000000이하의 자연수입니다.
 */
public class Question30 {
    public int[] solution(int n, int m) {
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        //최대공약수
        while (min != 0) {
            int d = max % min;
            max = min;
            min = d;
        }
        //최소공배수 = 두수의 곱 / 최대공약수
        int r = n * m / max;
        int[] answer = {max, r};
        return answer;
    }

    /**
     * 다른 사람의 풀이
     */
    public int[] solution2(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
}

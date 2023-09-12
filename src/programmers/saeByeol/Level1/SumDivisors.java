package programmers.saeByeol.Level1;

/**
 * 약수의 합
 *
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한사항
 * n은 0 이상 3000이하인 정수입니다.
 */
public class SumDivisors {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i > 0) {    //num % i == 0 일 때 answer 에 값을 더해주면 해당 코드 불필요!
                continue;
            }
            answer += n / i;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumDivisors sumDivisors = new SumDivisors();
        int solution = sumDivisors.solution(5);
        System.out.println("solution = " + solution);
    }
}

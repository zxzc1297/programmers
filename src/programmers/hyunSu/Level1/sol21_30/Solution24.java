package programmers.hyunSu.Level1.sol21_30;

/**
 * 문제 설명
 * 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
 * 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 */
public class Solution24 {

    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<= right; i++){
            int cnt=0;
            for(int j = 1; j<=i; j++){
                if( i % j == 0){
                    cnt++;
                }
            }

            if(cnt%2==0){
                answer += i;
            }else if(cnt%2 != 0){
                answer -= i;
            }
        }
        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int solution2(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}

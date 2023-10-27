package programmers.hyunSu.Level1.sol51_60;

/**
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 *
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 *
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 */
public class Solution55 {
    public int solution(int n) {
        int answer = n >=2 ? 1 : 0;
        answer = n>=3 ? 2 : answer;
        answer = n>=5 ? 3 : answer;
        answer = n>=7 ? 4 : answer;
        int index = 11;
        while(index <= n){
            int index2 =3;
            boolean res = true;
            while(index2<=Math.sqrt(index)){
                if(index%index2 == 0){
                    res =false;
                    break;
                }
                index2 +=2;
            }

            if(res){
                answer++;
            }
            index += 2;
        }
        return answer;
    }
}

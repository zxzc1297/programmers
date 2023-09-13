package programmers.myungGyu.Level1;

/**
 * 약수의 합
 *
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한사항
 * n은 0 이상 3000이하인 정수입니다.
 */

public class Question_2 {

    //나머지 값이 없는 정수들을 뽑아서 더하기
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    //다른사람 풀이 : 모든 약수들에 합이기때문에 절반까지만 돌리고 주어진 숫자를 마지막에 더함
    public int sumDivisor(int num) {
        int answer = 0;
        for(int i =1 ; i<=num/2; i++){
            if(num%i==0){
                answer+=i;
            }
        }

        return answer+num;
    }
}

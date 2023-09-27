package programmers.myungGyu.Level1;

/**
 * 하샤드 수
 *
 * 문제 설명
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 */
public class Question_12 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            String m = Integer.toString(x);
            int t = 0;

            for(int i = 0; i<m.length(); i++){
                t += Integer.parseInt(m.substring(i, i+1));
            }
            if(x % t == 0){
                answer = true;
            }else{
                answer = false;
            }

            return answer;
        }
    }

    //다른사람 풀이
    class Solution2 {
        public boolean solution(int x) {
            int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
            return x % sum == 0;
        }
    }
}

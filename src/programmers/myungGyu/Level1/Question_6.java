package programmers.myungGyu.Level1;
/**
 * x만큼 간격이 있는 n개의 숫자
 *
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution 을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 */
public class Question_6 {
    //long type에 대한 변환이 필요
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            //answer[i] = x * (i+1);  -- 테스트 13,14번 케이스 에러, 타입 변환이 필요
            answer[i] = x * ((long)i+1);
        }
        return answer;
    }

    //다른사람 풀이
    public static long[] solution2(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

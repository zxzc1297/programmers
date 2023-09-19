package programmers.saeByeol.Level1;

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
public class XintervalN_6 {
    /**
     * 첫번째 시도
     * @param x
     * @param n
     * @return
     * 테스트 13, 14 실패
     * incX 타입을 int 로 하면 안되고 long 으로 해야함
     */
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long incX = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = incX;
            incX += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        XintervalN_6 xintervalN6 = new XintervalN_6();
        long[] solution = xintervalN6.solution(-4, 2);
        for (long l : solution) {
            System.out.println("l = " + l);
        }
    }
}

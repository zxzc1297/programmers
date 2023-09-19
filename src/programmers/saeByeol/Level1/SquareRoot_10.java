package programmers.saeByeol.Level1;

/**
 * 정수 제곱근 판별
 * 문제 설명
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * 제한 사항
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */
public class SquareRoot_10 {
    /**
     * 테스트 13 실패
     * @param n
     * @return
     */
    public long solution1(long n) {
        long cnt = 0;
        while (cnt < 999999999) {
            cnt++;
            if (n / cnt == cnt) {
                return (cnt + 1) * (cnt + 1);
            }
        }
        return -1;
    }

    /**
     * 다른사람의 풀이
     * @param n
     * @return
     */
    public long solution2(long n) {
        Double sqrt = Math.sqrt(n); //제곱근 구함. return 11.0
        if(sqrt == sqrt.intValue()){ //11.0과 11을 비교해 양의 정수인지 확인한다.
            return (long)Math.pow(sqrt + 1, 2); //Math.pow(a, b) a 값을 b 제곱 해준다. return 144.0
        } else return -1;
    }

    public long solution3(long n) {
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
            else answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        SquareRoot_10 squareRoot10 = new SquareRoot_10();
        long solution = squareRoot10.solution2(121);
        //System.out.println("solution = " + solution);
    }
}

package programmers.saeByeol.Level1;

/**
 * 자연수 뒤집어 배열로 만들기
 *
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class FlipNaturalNumbers_7 {
    public int[] solution(long n) {
        String nString = n + "";
        int[] answer = new int[nString.length()];
        String[] split = nString.split("");
        for (int i = 0; i < nString.length(); i++) {
            answer[i] = Integer.parseInt(split[nString.length() - i - 1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipNaturalNumbers_7 flipNaturalNumbers7 = new FlipNaturalNumbers_7();
        int[] solution = flipNaturalNumbers7.solution(12345);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

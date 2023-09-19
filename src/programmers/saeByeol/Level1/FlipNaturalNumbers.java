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
public class FlipNaturalNumbers {
    public int[] solution(long n) {
        int s = Long.valueOf(n).intValue();
        String m = Integer.toString(s);
        int m_len = m.length();
        int[] answer = new int[m_len];
        for(int i = 1; i <= m_len; i++){
            answer[i-1] = Integer.parseInt(m.substring(m.length() - i, m.length() - i + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipNaturalNumbers flipNaturalNumbers = new FlipNaturalNumbers();
        int[] solution = flipNaturalNumbers.solution(12345);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

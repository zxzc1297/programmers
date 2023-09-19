package programmers.myungGyu.Level1;
/**
 * 자연수 뒤집어 배열로 만들기
 *
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class Question_7 {
    //내가 쓴 첫번째 답, 런타임 오류 포함 3개의 테스트 실패
    public int[] solution(long n) {
        int s = Long.valueOf(n).intValue();//<- 이게 원인..?
        String m = Integer.toString(s);
        int m_len = m.length();
        int[] answer = new int[m_len];

        for(int i = 1; i <= m_len; i++){
            answer[i-1] = Integer.parseInt(m.substring(m.length() - i, m.length() - i + 1));
        }
        return answer;
    }

    //string 변환 방식을 변경해보니 성공
    public int[] solution2(long n) {
        String m = n + "";
        int m_len = m.length();
        int[] answer = new int[m_len];
        for(int i = 1; i <= m_len; i++){
            answer[i-1] = Integer.parseInt(m.substring(m.length() - i, m.length() - i + 1));
        }
        return answer;
    }

    //다른사람 풀이
    public int[] solution3(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}

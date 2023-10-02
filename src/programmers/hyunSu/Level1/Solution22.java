package programmers.hyunSu.Level1;

/**
 * 문제 설명
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 */

public class Solution22 {

    public String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++){
            answer += i%2==0 ? "박" : "수";
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public String solution2(int n) {
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}

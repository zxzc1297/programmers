package programmers.myungGyu.Level1;
/**
 * 정수 내림차순으로 배치하기
 *
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 */
import java.util.Arrays;
public class Question_11 {
    //라이브러리 이용해서 풀기
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        String v = new String();
        for(int i=arr.length-1; i>=0; i--){
            v += arr[i];
        }
        answer=Long.parseLong(v);

        return answer;
    }

    //다른사람 풀이
    public long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}

package programmers.saeByeol.Level1;
import java.util.*;
/**
 * 3진법 뒤집기
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 */
public class Question32 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }
        int listLen = list.size();
        for (int i = 0; i < list.size(); i++) {
            listLen--;
            answer += list.get(i) * Math.pow(3, listLen);
        }
        return answer;
    }

    /**
     * 다른 사람의 풀이
     */
    public int solution2(int n) {
        String a = "";
        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();
        return Integer.parseInt(a,3);

        //System.out.println(Integer.parseInt("0021",3));   10진법을 3진법으로 바꾼 문자를 10진법으로 변환
        //System.out.println(Integer.toString(45,3));       10진법을 3진법 문자로 바꾸기

    }
}

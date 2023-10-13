package programmers.hyunSu.Level1.sol31_40;

import java.util.ArrayList;

/**
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 */
public class Solution32 {

    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0){;
            list.add(n % 3);
            n = n/3;
        }

        for(int i=0; i<list.size(); i++){
            answer += list.get(i) * Math.pow(3, list.size()-i-1);
        }

        return answer;
    }
}

package programmers.hyunSu.Level1.sol11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 설명
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 */
public class Solution19 {

    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int element : numbers) {
            list.add(element);
        }

        for(int i=0; i<10; i++){
            if(!(list.contains(i))){
                answer += i;
            }
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int solution2(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

    public int solution3(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}

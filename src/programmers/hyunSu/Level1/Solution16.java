package programmers.hyunSu.Level1;

import java.util.Arrays;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 */
public class Solution16 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int length = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                length++;
            }
        }

        if(length != 0){
            answer = new int[length];
            length = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[length] = arr[i];
                    length++;
                }
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int[] divisible(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
    }

}

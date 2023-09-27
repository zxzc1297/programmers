package programmers.hyunSu.Level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 문제 설명
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */
public class Solution20 {

    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length<=1) {
            answer = new int[]{-1};
        } else {
            answer = Arrays.stream(arr).filter(i -> i != Arrays.stream(arr).min().getAsInt()).toArray();
        }
        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int[] solution2(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        if (list.size() <= 0) return new int[]{-1};
        return list.stream().mapToInt(i->i).toArray();
    }

    public int[] solution3(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        int[] answer = new int[arr.length - 1];
        int i = 0;
        int j = 0;
        while(i < answer.length){
            if(j == minIndex){
                j++;
                continue;
            }
            answer[i++] = arr[j++];
        }
        return answer;
    }
}

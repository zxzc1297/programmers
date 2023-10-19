package programmers.saeByeol.Level1;
import java.util.*;

/**
 * 두 개 뽑아서 더하기
 * 문제 설명
 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 */
public class Question44 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();     //HashSet 이 아닌 TreeSet 을 사용하면 add 하면서 정렬 가능
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = new int[set.size()];
        int k = 0;
        for (int s : set) {
            answer[k++] = s;
        }
        Arrays.sort(answer);
        return answer;
    }

    public int[] solution2(int[] numbers) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                int tmp = numbers[i] + numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }
            }
        }
        int size = 0;
        answer = new int[list.size()];
        for(int num : list){
            answer[size++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}

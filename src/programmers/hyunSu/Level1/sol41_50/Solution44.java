package programmers.hyunSu.Level1.sol41_50;

import java.util.*;

/**
 * 문제 설명
 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
 * 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 */
public class Solution44 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> adds = new ArrayList<>();
        ArrayList<Integer> checkEqual = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                adds.add(numbers[i] + numbers[j]);
            }
        }

        for(int k=0; k<adds.size(); k++){
            if(!checkEqual.contains(adds.get(k))){
                checkEqual.add(adds.get(k));
            }
        }

        int[] answer = new int[checkEqual.size()];
        for(int l=0; l< checkEqual.size(); l++){
            answer[l] = checkEqual.get(l);
        }
        Arrays.sort(answer);

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public static ArrayList<Integer> solution2(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer.add(iter.next());
        }

        Collections.sort(answer);
        return answer;
    }

    /**
     * 인터넷에서 찾은 함수로 재풀이
     */
    public int[] solution3(int[] numbers) {
        int[] answer = new int[numbers.length * (numbers.length-1) / 2];
        int index =0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer[index++] = numbers[i] + numbers[j];
            }
        }

        int[] newArr = Arrays.stream(answer).distinct().toArray();
        Arrays.sort(newArr);
        return newArr;
    }
}

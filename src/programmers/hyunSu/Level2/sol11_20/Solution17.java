package programmers.hyunSu.Level2.sol11_20;

import java.util.*;

/**
 * 문제 설명
 * 경화는 과수원에서 귤을 수확했습니다. 경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다.
 * 그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때
 * 서로 다른 종류의 수를 최소화하고 싶습니다.
 *
 * 예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다.
 * 경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면,
 * 귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.
 *
 * 경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다.
 * 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
 * 1 ≤ tangerine의 원소 ≤ 10,000,000
 */
public class Solution17 {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] list = new int[tangerine[tangerine.length-1]+1];
        for(int tang : tangerine){
            int temp = list[tang];
            list[tang] = temp+1;
        }
        Arrays.sort(list);
        for(int i=list.length-1; i>=0; i--){
            k = k-list[i];
            answer++;
            if(k<=0)
                break;
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int solution2(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map =new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2)-map.get(o1));

        for(Integer key:list){
            k -=map.get(key);
            answer++;
            if(k<=0){
                break;
            }
        }

        return answer;
    }

    public static int solution3(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> box = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            box.put(tangerine[i], box.getOrDefault(tangerine[i], 0) + 1);
        }

        ArrayList<Integer> sizes = new ArrayList<>(box.values());
        sizes.sort(((o1, o2) -> o2 - o1));

        int count = 0;
        for (int i = 0; i < sizes.size(); i++) {
            count += sizes.get(i);
            answer++;
            if(count >= k){
                return answer;
            }
        }

        return answer;
    }
}

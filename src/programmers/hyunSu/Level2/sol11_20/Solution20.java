package programmers.hyunSu.Level2.sol11_20;

import java.util.*;
import java.util.stream.LongStream;

/**
 * 문제 설명
 * 정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.
 *
 * n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
 * i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
 * 1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
 * 1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
 * 새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
 * 정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 107
 * 0 ≤ left ≤ right < n2
 * right - left < 105
 */
public class Solution20 {

    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int) (right-left+1)];

        int pos = 0;
        for(long i=left+1; i<=right+1; i++){
            long idx = i%n == 0 ? n : Math.max(i / n + 1, i % n);
            answer[pos] = idx;
            pos++;
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int[] solution2(int n, long left, long right) {
        return LongStream.rangeClosed(left, right).mapToInt(value -> (int) (Math.max(value / n, value % n) + 1)).toArray();
    }

    public int[] solution3(int n, long left, long right) {
        List<Integer> ansList = new ArrayList<>();
        int leftInt = (int)left;
        int rightInt = (int)right;

        for(long i = left; i <= right; i++){
            if(i / n <= i % n)
                ansList.add((int)(i % n) + 1);
            else
                ansList.add((int)(i / n) + 1);
        }

        int[] answer = new int[ansList.size()];

        for(int i = 0; i < answer.length; i++)
            answer[i] = ansList.get(i);

        return answer;
    }
}

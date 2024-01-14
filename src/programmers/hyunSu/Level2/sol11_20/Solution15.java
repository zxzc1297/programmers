package programmers.hyunSu.Level2.sol11_20;

/**
 * 문제 설명
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다.
 * 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 *
 * 제한 사항
 * arr은 길이 1이상, 15이하인 배열입니다.
 * arr의 원소는 100 이하인 자연수입니다.
 */
public class Solution15 {

    public int solution(int[] arr) {
        int answer = 0;

        if(arr.length == 1)
            return arr[0];

        int max = Math.max(arr[0], arr[1]);
        int min = Math.min(arr[0], arr[1]);

        while(min!=0){
            int d = max % min;
            max = min;
            min = d;
        }
        answer = arr[0] * arr[1] / max;


        if(arr.length>2){
            for(int i=2; i<arr.length; i++){
                max = Math.max(answer, arr[i]);
                min = Math.min(answer, arr[i]);
                while(min!=0){
                    int d = max % min;
                    max = min;
                    min = d;
                }
                answer = answer * arr[i] / max;
            }
        }

        return answer;
    }
}

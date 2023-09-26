package programmers.saeByeol.Level1;

/**
 * 제일 작은 수 제거하기
 *
 * 문제 설명
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */
public class Question20 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = 0;
        int cnt = 0;
        //빈 배열
        if (arr.length == 1) return new int[]{-1};
        //가장 작은 수 찾기
        for (int i = 1; i < arr.length; i++) {
            min = (i == 1) ? Math.min(arr[0], arr[1]) : Math.min(min, arr[i]);
        }
        //배열에 넣어주기
        for (int a : arr) {
            if (a == min) continue;
            else answer[cnt] = a; ++cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Question20 question20 = new Question20();
        int[] arr = {9,2,7,4};
        int[] solution = question20.solution(arr);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

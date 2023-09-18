package programmers.myungGyu.Level1;

public class Question_6 {
    //long type에 대한 변환이 필요
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            //answer[i] = x * (i+1);  -- 테스트 13,14번 케이스 에러, 타입 변환이 필요
            answer[i] = x * ((long)i+1);
        }
        return answer;
    }

    //다른사람 풀이
    public static long[] solution2(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

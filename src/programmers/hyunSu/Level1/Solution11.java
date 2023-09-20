package programmers.hyunSu.Level1;

/**
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */
public class Solution11 {

    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        String[] list = new String[num.length()];
        String result ="";

        for(int i=0; i<list.length; i++){
            list[i] = num.substring(i, i+1);
        }

        for(int j=0; j<list.length; j++){
            for(int k=j+1; k<list.length; k++){
                if(Integer.valueOf(list[j]) < Integer.valueOf(list[k])){
                    String temp = list[j];
                    list[j] = list[k];
                    list[k] = temp;
                }
            }
        }

        for(int p=0; p<list.length; p++){
            result += list[p];
        }
        answer = Long.parseLong(result);

        return answer;
    }
}

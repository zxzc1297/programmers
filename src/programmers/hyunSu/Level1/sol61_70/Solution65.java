package programmers.hyunSu.Level1.sol61_70;

/**
 * 문제 설명
 * 문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.
 *
 * 먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
 * 이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다.
 * 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
 * s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
 * 만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
 * 문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고,
 * 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.
 *
 * 제한사항
 * 1 ≤ s의 길이 ≤ 10,000
 * s는 영어 소문자로만 이루어져 있습니다.
 */
public class Solution65 {

    public int solution(String s) {
        int answer = 0;

        char[] chars = s.toCharArray();
        char startC = '1';
        int cnt = -1;
        for(int i=0; i<chars.length; i++){
            if(startC == '1'){
                startC = chars[i];
                cnt = 1;
                if(i==chars.length-1)
                    answer++;
            } else{
                if(startC == chars[i])
                    cnt++;
                else
                    cnt --;

                if(cnt == 0){
                    answer++;
                    startC = '1';
                } else if(cnt != 0 && i == (chars.length-1)){
                    answer++;
                }
            }
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int solution2(String s) {
        char prev = '1';
        int same = 0, different = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (prev == '1') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                prev = '1';
                same = 0; different = 0;
            }
        }

        return answer;
    }
}

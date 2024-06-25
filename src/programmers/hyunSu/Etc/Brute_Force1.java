package programmers.hyunSu.Etc;
import java.util.*;

/**
 * 문제 설명
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
 *
 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers는 길이 1 이상 7 이하인 문자열입니다.
 * numbers는 0~9까지 숫자만으로 이루어져 있습니다.
 * "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 * 입출력 예
 * numbers	return
 * "17"	3
 * "011"	2
 * 입출력 예 설명
 * 예제 #1
 * [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
 *
 * 예제 #2
 * [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
 *
 * 11과 011은 같은 숫자로 취급합니다.
 */
public class Brute_Force1 {
    boolean[] visited = new boolean[7];
    HashSet<Integer> joinNums = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        dfs(numbers, "", 0);
        //System.out.println(joinNums.toString());
        //3.전체 수 조합이 소수인지 판별
        Iterator iter = joinNums.iterator();
        while(iter.hasNext()){
            int temp = (int) iter.next();
            boolean isDecimal = true;

            if(temp < 2){
                isDecimal = false;
            } else {
                for(int k=2; k<=(int)Math.sqrt(temp); k++){
                    if(temp % k == 0){
                        isDecimal = false;
                        break;
                    }
                }
            }
            if(isDecimal) answer++;
        }

        return answer;
    }

    public void dfs(String numbers, String s, int depth) {
        // numbers 의 끝까지 다 탐색했다면 종료
        if (depth > numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                joinNums.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers ,s + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }
}

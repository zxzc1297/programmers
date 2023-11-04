package programmers.hyunSu.Level1.sol61_70;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 문제 설명
 * 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는
 * 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
 * X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
 *
 * 예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로
 * 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고
 * Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는
 * 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
 * 두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
 * X, Y는 0으로 시작하지 않습니다.
 * X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
 */
public class Solution62 {
    // 내가 한 시간 초과
    public String solution(String X, String Y) {
        String answer = "";
        String shorter = "";
        ArrayList<String> LongerList = new ArrayList<>();
        ArrayList<String> matchList = new ArrayList<>();

        if(X.length() > Y.length()){
            shorter = Y;
            for(int k=0; k<X.length(); k++)
                LongerList.add(X.substring(k,k+1));
        }else {
            shorter = X;
            for(int k=0; k<Y.length(); k++)
                LongerList.add(Y.substring(k,k+1));
        }


        for(int i=0; i<shorter.length(); i++){
            String shortC = shorter.substring(i,i+1);
            if(LongerList.contains(shortC)){
                matchList.add(shortC);
                LongerList.remove(shortC);
            }
        }
        if(matchList.size() == 0){
            answer = "-1";
        }else {
            matchList.sort(Comparator.reverseOrder());
            for(String match : matchList)
                answer += match;

            if(answer.replaceAll("0", "").equals(""))
                answer = "0";
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public String solution2(String X, String Y) {
        String answer = "";
        int[] xArray = new int[10];
        int[] yArray = new int[10];

        // X와 Y의 각각의 숫자가 몇번 나왔는지 판단
        for(String temp : X.split("")){
            Integer index = Integer.parseInt(temp);
            xArray[index]++;
        }

        for(String temp : Y.split("")){
            Integer index = Integer.parseInt(temp);
            yArray[index]++;
        }

        // 정답을 만들기 위한 배열에 적은 갯수 나온 값으로 대입
        int[] answerArray = new int[10];
        for(int i=0; i<10; i++){
            answerArray[i] = xArray[i] >= yArray[i] ? yArray[i] : xArray[i];
        }

        //9에서부터 돌면서 i가 answerArray[i]번
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            for(int j=0; j<answerArray[i]; j++){
                //answer += String.valueOf(i);
                sb.append(i);
            }
        }

        answer = sb.toString();
        // 조건 추가
        if(answer.equals("")) answer = "-1";
        else if(answer.replace("0","") == "") answer = "0";
        return answer;
    }
}

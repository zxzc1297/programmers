package programmers.hyunSu.Level1.sol31_40;

import java.util.HashMap;

/**
 * 문제 설명
 * img1.png
 *
 * 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때
 * 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
 *
 * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
 *
 * 1478 → "one4seveneight"
 * 234567 → "23four5six7"
 * 10203 → "1zerotwozero3"
 * 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
 * s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 *
 * 참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
 *
 * 숫자	영단어
 * 0	zero
 * 1	one
 * 2	two
 * 3	three
 * 4	four
 * 5	five
 * 6	six
 * 7	seven
 * 8	eight
 * 9	nine
 * 제한사항
 * 1 ≤ s의 길이 ≤ 50
 * s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
 * return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
 */
public class Solution39 {
    //나는 멍청하다.... 이렇게 밖에... 왜 replace가 안 떠오르는거야 멍청아
    public static int solution(String s) {
        String answer = "";
        HashMap<String,String> table = new HashMap<>();
        table.put("zero", "0");
        table.put("one", "1");
        table.put("two", "2");
        table.put("three", "3");
        table.put("four", "4");
        table.put("five", "5");
        table.put("six", "6");
        table.put("seven", "7");
        table.put("eight", "8");
        table.put("nine", "9");

        int tmpCnt = 0;
        for(int i=0; i<s.length(); i++){
            if(checkNum(s.substring(i, i+1))){
                answer += s.substring(i, i + 1);
                tmpCnt = 0;
            }else {
                if(i != 0){
                    if(table.get(s.substring(i-tmpCnt, i+1)) != null){
                        answer += table.get(s.substring(i-tmpCnt, i+1));
                        tmpCnt = 0;
                    }else{
                        tmpCnt++;
                    }
                }else{
                    tmpCnt++;
                }

            }
        }
        return Integer.valueOf(answer);
    }

    public static boolean checkNum(String check){
        if (check.equals("1") || check.equals("2") || check.equals("3") || check.equals("4")|| check.equals("5") || check.equals("6") ||
                check.equals("7") || check.equals("8") || check.equals("9") || check.equals("0") ){
            return true;
        } else{
            return false;
        }
    }


    /**
     * 다른 사람 풀이
     */
    public int solution2(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}

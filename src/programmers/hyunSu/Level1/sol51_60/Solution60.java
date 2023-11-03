package programmers.hyunSu.Level1.sol51_60;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 설명
 * 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는
 * 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 문자열 배열 babbling이 매개변수로 주어질 때,
 * 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ babbling의 길이 ≤ 100
 * 1 ≤ babbling[i]의 길이 ≤ 30
 * 문자열은 알파벳 소문자로만 이루어져 있습니다.
 */
public class Solution60 {

    public int solution(String[] babbling) {
        int answer = babbling.length;
        List<String> pronunList = new ArrayList<>();
        pronunList.add("aya");
        pronunList.add("ye");
        pronunList.add("woo");
        pronunList.add("ma");

        for(int i=0; i<babbling.length; i++){
            int index = 2;
            int preIndex=0;
            String prevBabble = "";
            for(int j=0; j<babbling[i].length(); j++){
                if(index <= babbling[i].length()){
                    if(pronunList.contains(babbling[i].substring(preIndex,index)) && !babbling[i].substring(preIndex,index).equals(prevBabble)){
                        prevBabble = babbling[i].substring(preIndex,index);
                        index += 2;
                        preIndex += 2;
                    } else if(index+1 <= babbling[i].length()){
                        if(pronunList.contains(babbling[i].substring(preIndex,index+1)) && !babbling[i].substring(preIndex,index+1).equals(prevBabble)){
                            prevBabble = babbling[i].substring(preIndex,index+1);
                            index += 3;
                            preIndex += 3;
                        }else {
                            answer -= 1;
                            break;
                        }
                    } else {
                        answer -= 1;
                        break;
                    }
                } else if(preIndex != babbling[i].length()) {
                    answer -= 1;
                    break;
                }
            }
        }

        return answer;
    }

    /**
     * 다른 사람 풀이
     */
    public int solution2(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama","1");
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma"," ");
            babbling[i] = babbling[i].replaceAll(" ","");
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}

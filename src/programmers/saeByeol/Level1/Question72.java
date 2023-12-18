package programmers.saeByeol.Level1;
import java.util.*;

/**
 * 성격 유형 검사하기
 * 문제 설명
 * 나만의 카카오 성격 유형 검사지를 만들려고 합니다.
 * 성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.
 *
 * 지표 번호	성격 유형
 * 1번 지표	라이언형(R), 튜브형(T)
 * 2번 지표	콘형(C), 프로도형(F)
 * 3번 지표	제이지형(J), 무지형(M)
 * 4번 지표	어피치형(A), 네오형(N)
 * 4개의 지표가 있으므로 성격 유형은 총 16(=2 x 2 x 2 x 2)가지가 나올 수 있습니다. 예를 들어, "RFMN"이나 "TCMA"와 같은 성격 유형이 있습니다.
 *
 * 검사지에는 총 n개의 질문이 있고, 각 질문에는 아래와 같은 7개의 선택지가 있습니다.
 *
 * 매우 비동의
 * 비동의
 * 약간 비동의
 * 모르겠음
 * 약간 동의
 * 동의
 * 매우 동의
 * 각 질문은 1가지 지표로 성격 유형 점수를 판단합니다.
 */
public class Question72 {
    public String solution(String[] survey, int[] choices) {
        int index = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        for (int choice : choices) {
            int choiceInt = (choice > 4) ? 1 : 0;
            int num = getNum(choice);
            if (map.containsKey(survey[index].charAt(choiceInt))) {
                num += map.get(survey[index].charAt(choiceInt));
            }
            map.put(survey[index].charAt(choiceInt), num);
            index++;
        }
        return getResult(map);
    }

    public int getNum(int choice) {
        int num = 0;
        switch (choice) {
            case 1 :
            case 7 : num = 3;
                break;
            case 2 :
            case 6 : num = 2;
                break;
            case 3 :
            case 5 : num = 1;
                break;
            case 4 : num = 0;
                break;
        }
        return num;
    }

    public String getResult(Map<Character, Integer> map) {
        String answer = "RCJA";
        answer = (map.get('R') < map.get('T')) ? answer.replace("R", "T") : answer;
        answer = (map.get('C') < map.get('F')) ? answer.replace("C", "F") : answer;
        answer = (map.get('J') < map.get('M')) ? answer.replace("J", "M") : answer;
        answer = (map.get('A') < map.get('N')) ? answer.replace("A", "N") : answer;
        return answer;
    }
}

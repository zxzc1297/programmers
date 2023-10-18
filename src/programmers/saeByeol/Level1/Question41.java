package programmers.saeByeol.Level1;

import java.util.*;

/**
 * 문자열 내 마음대로 정렬하기
 * 문제 설명
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 *
 * 제한 조건
 * strings는 길이 1 이상, 50이하인 배열입니다.
 * strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 * 모든 strings의 원소의 길이는 n보다 큽니다.
 * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 */
public class Question41 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 1; j < strings.length; j++) {
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }

    /**
     * 다른 사람의 풀이
     */
    public String[] solution2(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public String[] solution3(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
    }
}

package programmers.saeByeol.Level2;
import java.util.*;
/**
 * 짝지어 제거하기
 * 문제 설명
 * 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
 * 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
 * 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.
 *
 * 예를 들어, 문자열 S = baabaa 라면
 *
 * b aa baa → bb aa → aa →
 *
 * 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
 *
 * 제한사항
 * 문자열의 길이 : 1,000,000이하의 자연수
 * 문자열은 모두 소문자로 이루어져 있습니다.
 */
public class Question9 {
    public int solution(String s)
    {
        int answer = 0;
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String curr = arr[i];
            if (stack.isEmpty()) {
                stack.push(curr);
            } else {
                if (stack.peek().equals(curr)) { //stack 의 가장 위에 값을 가져옴
                    stack.pop();
                } else {
                    stack.push(curr);
                }
            }
        }

        return stack.size() > 0 ? 0 : 1;
    }

    /**
     * 다른 사람의 풀이
     * @param s
     * @return
     */
    public int solution2(String s)
    {
        // 문자열을 캐릭터 배열로 변환
        char[] c = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        // 캐릭터를 하나씩 리스트에 삽입
        for(char _c : c){
            Add(list, _c);
        }

        // 만약 리스트가 비었다면 짝지거 제거 완료
        if(list.isEmpty()){
            return 1;
        }
        else {
            return 0;
        }
    }

    // 리스트에 캐릭터 하나씩 삽입하는 함수
    public static void Add(ArrayList _list, char _c){
        _list.add(_c);

        // 만약 리스트의 길이가 2보다 크고 && 마지막 두 원소가 같은 캐릭터라면
        if(_list.size() > 1 && (_list.get(_list.size() - 2) == _list.get(_list.size() - 1))){
            // 마지막 두 원소 제거
            _list.remove(_list.size() - 1);
            _list.remove(_list.size() - 1);
        }
    }
}

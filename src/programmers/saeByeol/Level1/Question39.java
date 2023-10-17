package programmers.saeByeol.Level1;

/**
 * 숫자 문자열과 영단어
 * 문제 설명
 * 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
 *
 * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
 *
 * 1478 → "one4seveneight"
 * 234567 → "23four5six7"
 * 10203 → "1zerotwozero3"
 * 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 */
public class Question39 {
    public int solution(String s) {
        String answer = "";
        String addString = "";
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                answer += s.charAt(i);
            } else {
                addString += s.charAt(i);
                for (int j = 0; j < word.length; j++) {
                    if (addString.equals(word[j])) {
                        answer += j;
                        addString = "";
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(answer);
    }

    public int solution2(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}

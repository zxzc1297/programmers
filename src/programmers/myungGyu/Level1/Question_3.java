package programmers.myungGyu.Level1;

/**
 * 짝수와 홀수
 *
 * 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 */
public class Question_3 {
    //2를 나눔으로써 홀수, 짝수 구분
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        } else{
            answer = "Odd";
        }

        return answer;
    }

    //다른사람 풀이
    String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}

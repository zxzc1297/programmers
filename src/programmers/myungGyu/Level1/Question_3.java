package programmers.myungGyu.Level1;

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

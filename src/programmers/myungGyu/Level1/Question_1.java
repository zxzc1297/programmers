package programmers.myungGyu.Level1;

public class Question_1
{
    //문자형 변형
    public int solution(int n) {
        int answer = 0;
        String m = Integer.toString(n);

        for(int i = 0; i<m.length(); i++){
            answer += Integer.parseInt(m.substring(i, i+1));
        }

        return answer;
    }

    //다른 풀이 정수 나눗셈
    public int solution2(int n2) {
        int answer2 = 0;

        while(n2 < 0){
            answer2 += n2%10;
            if(n2 < 10)
                break;
            n2=n2/10;
        }
        return answer2;
    }
}

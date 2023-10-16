package programmers.saeByeol.Level1;

/**
 * 최소직사각형
 * 문제 설명
 * 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
 * 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
 *
 * 아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
 *
 * 명함 번호	가로 길이	세로 길이
 * 1	60	50
 * 2	30	70
 * 3	60	30
 * 4	80	40
 * 가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
 * 하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.
 *
 * 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
 * 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
 */
public class Question37 {
    public int solution(int[][] sizes) {
        int g = Math.max(sizes[0][0], sizes[0][1]); //가로
        int s = Math.min(sizes[0][0], sizes[0][1]);; //세로
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                g = Math.max(g, sizes[i][0]);
                s = Math.max(s, sizes[i][1]);
            } else {
                g = Math.max(g, sizes[i][1]);
                s = Math.max(s, sizes[i][0]);
            }
        }
        return g * s;
    }

    /**
     * 다른 사람의 풀이
     */
    public int solution2(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}

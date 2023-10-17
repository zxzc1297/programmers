package programmers.saeByeol.Level1;

/**
 * [1차] 비밀지도
 * 문제 설명
 * 비밀지도
 * 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
 * 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
 *
 * 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
 * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
 * 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
 * "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
 * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
 */
public class Question40 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String a1 = "";
            String a2 = "";
            String s = "";
            while (arr1[i] >= 0) {
                a1 = (arr1[i] % 2) + a1;
                arr1[i] /= 2;
                if (a1.length() == n) break;
            }
            while (arr2[i] >= 0) {
                a2 = (arr2[i] % 2) + a2;
                arr2[i] /= 2;
                if (a2.length() == n) break;
            }
            for (int j = 0; j < n; j++) {
                if ((int)(a1.charAt(j) - '0') + (int)(a2.charAt(j) - '0') >= 1) s += "#";
                else s += " ";
            }
            answer[i] = s;
        }
        return answer;
    }

    /**
     * 다른 사람의 풀이
     */
    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            // toBinaryString : 어떤 숫자를 2진수 문자열로 바꿔주는 함수입니다.
            // String temp = Integer.toBinaryString(9 | 30);
            // 우선 9는 01001, 30은 11110입니다. 이 두 2진수를 비트 연산자를 사용해서 무언가 값을 구하고 싶다면 위의 코드처럼 사용하면 됩니다. 물론 &도 가능합니다.
            //위의 코드는 결국 11111이 됩니다. &로는 01000입니다.
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}

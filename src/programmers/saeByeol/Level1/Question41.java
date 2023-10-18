package programmers.saeByeol.Level1;

import java.util.Arrays;

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

//    public static void main(String[] args) {
//        Question41 question41 = new Question41();
//        String[] strings = {"abc", "ab"};
//        String[] solution = question41.solution(strings, 1);
//        for (String s : solution) {
//            System.out.println("s = " + s);
//        }
//    }
}

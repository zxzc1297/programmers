package programmers.saeByeol.Level1;

import java.util.*;

public class Question41 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        Arrays.sort(strings); //asca, assc, cdas
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 1; j < strings.length; j++) { //cdas, assc, asca
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    answer[i] = strings[j];
                    answer[j] = strings[i];
                } else if (strings[i].charAt(n) == strings[j].charAt(n)) {
                    list.add(strings[i]);
                    list.add(strings[i]);
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        Question41 question41 = new Question41();
        String[] strings = {"cdas", "assc", "asca"}; //cdas, asca, assc
        String[] solution = question41.solution(strings, 1);
        for (String s : solution) {
            //System.out.println("s = " + s);
        }
    }
}

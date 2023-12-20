package programmers.saeByeol.Level1;
import java.util.*;
public class Question75 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        for (String player : players) {
            map.put(player, ++index);
            answer[index++] = player;
        }
        for (String calling : callings) {
//            for (int i = 0; i < answer.length; i++) {
//                map
//            }
//            map.get(calling)
//            if (players[i].equals(calling)) {
//                String temp = players[i];
//                players[i] = players[i - 1];
//                players[i - 1] = temp;
//            }
        }
        return answer;
    }
}

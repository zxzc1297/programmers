package programmers.hyunSu.Etc;
import java.util.*;

/**
 * 문제 설명
 * 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다.
 * 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다.
 * 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
 *
 * 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.
 *
 * 제한사항
 * 컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.
 * 각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
 * i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
 * computer[i][i]는 항상 1입니다.
 * 입출력 예
 * n	computers	return
 * 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
 * 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
 * 입출력 예 설명
 * 예제 #1
 * 아래와 같이 2개의 네트워크가 있습니다.
 * image0.png
 *
 * 예제 #2
 * 아래와 같이 1개의 네트워크가 있습니다.
 * image1.png
 */
public class Dfs_Bfs2 {
    int answer = 0;
    int[] dirX = {-1,1,0,0};
    int[] dirY = {0,0,-1,1};
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        //1. 각 노드 방문하는 dfs 만들기 들릴때마다 visited를 바꾸고 새로운 dfs 호출시 answer++;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                answer++;
                dfs(i, visited, computers);
            }
        }
        return answer;
    }

    public void dfs(int idx, boolean[] visited, int[][] computers){
        visited[idx] = true;
        for(int i=0; i<computers.length; i++){
            if(!visited[i] && computers[idx][i] == 1){
                dfs(i,visited,computers);
            }
        }
    }
}

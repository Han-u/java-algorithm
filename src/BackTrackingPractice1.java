import java.util.Arrays;

public class BackTrackingPractice1 {
    /*
        정수형 n과 m이 주어질때 1부터 n까지의 정수 중 중복 없이 m개를 고른 수열 출력
     */

    public static boolean[] visited;
    public static int[] out;

    public static void solution(int n, int m){
        visited = new boolean[n];
        out = new int[m];
        permutation(n, m, 0);
    }

    public static void permutation(int n, int m, int depth){
        if(depth == m){
            System.out.println(Arrays.toString(out));
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                out[depth] = i + 1;
                permutation(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args){
        solution(1, 2);
        System.out.println();
        solution(4, 3);
    }
}

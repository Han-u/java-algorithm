import java.util.ArrayList;

public class BackTrackingPractice4 {
    /*
        2차원 배열 o는 동전 #벽돌 .빈칸으로 채워져있다
        두 동전이 주어지고 함께 이동하다가 하나가 보드에서 떨어지는 경우 최소 이동 횟수를 출력하라

        규칙
        동전은 상하좌우로 함께 같은 방향으로 이동
        빈칸이나 동전이 없는 칸으로는 이동 가능
        벽일 때는 이동 불가
        이동 횟수가 10을 넘으면 중지하고 -1을 반환
     */
    final static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int cnt; // 결과값 카운팅
    static class Coin{
        int x;
        int y;

        public Coin(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void solution(char[][] board){
        if(board == null || board.length == 0 || board[0].length == 0){
            return ;
        }

        int n = board.length; // 행
        int m = board[0].length; //열
        cnt = Integer.MAX_VALUE;

        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'o') {
                    coins.add(new Coin(j, i));
                }
            }
        }

        Coin coin1 = coins.get(0);
        Coin coin2 = coins.get(1);
        backTracking(board, m, n, coin1.x, coin1.y, coin2.x, coin2.y, 0);
        System.out.println(cnt == Integer.MAX_VALUE? -1: cnt);

    }

    public static void backTracking(char[][] board, int m, int n, int x1, int y1, int x2, int y2, int moveCnt){
        if(moveCnt >= 10){
            return;
        }

        for(int[] dir: dirs){
            int x1Next = x1 + dir[0];
            int y1Next = y1 + dir[1];

            int x2Next = x2 + dir[0];
            int y2Next = y2 + dir[1];

            int dropCnt = 0;

            if(x1Next < 0 || x1Next >= m || y1Next < 0 || y1Next >= n){
                dropCnt += 1;
            }

            if(x2Next < 0 || x2Next >= m || y2Next < 0 || y2Next >= n){
                dropCnt += 1;
            }

            if(dropCnt == 2){
                continue;
            }

            if(dropCnt == 1){
                cnt  = Math.min(cnt, moveCnt + 1);
                return;
            }

            if(board[y1Next][x1Next] == '#'){
                x1Next = x1;
                y1Next = y1;
            }

            if(board[y2Next][x2Next] == '#'){
                y2Next = x2;
                y2Next = y2;
            }

            backTracking(board, m, n, x1Next, y1Next, x2Next, y2Next, moveCnt + 1);
        }
    }
    public static void main(String[] args){
        char[][] board = {{'.', '#'}, {'.', '#'}, {'.', '#'}, {'o', '#'}, {'o', '#'}, {'#', '#'}};
        solution(board);
    }
}

public class BackTracking {
    /*
        백트래킹
        - 모든 경우의 수를 탐색하며 최적해를 구하는 과정에서 유망하지 않은 쪽은 더이상 후가지 않는 방법
        - 유망 : 해가 될 가능성이 있는 경우
        - 가지치기: 해가 될 가능성이 없는 경우 해당 노드 제외
        - 백트래킹: 유망하지 않은 쪽으로 가지 않고 되돌아오는 것
     */
    static int n = 4;
    static int[] board = new int[n];
    static int cnt;

    public static int nQueen(int row){
        if(row == n){
            cnt++;
            for (int i = 0; i < n; i++) {
                System.out.print(board[i] + " ");
            }
            System.out.println();
            return cnt;
        }
        
        for (int i = 0; i < n; i++) {
            board[row] = i; // 재귀함수로 현재 행의 어떤 열에 퀸을 놓을 것인지

            //유망한지 아닌지 확인
            if (isPromising(row)){
                nQueen(row + 1);
            }
        }

        return cnt;
    }

    public static boolean isPromising(int row){
        for (int i = 0; i < row; i++) { // 현재행까지만 검사
            if (board[row] == board[i] || row - i == Math.abs(board[row] - board[i])) { // 다른 행에 놓인 퀸의 위치가 같으면 안 됨
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(nQueen(0));
    }
}

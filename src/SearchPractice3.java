public class SearchPractice3 {
    // 2차원 행렬 row X col 에서 target을 찾기

    public static boolean solution(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int left = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int right = rows * cols - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[mid / cols][mid % cols] == target){
                return true;
            }else if(matrix[mid / cols][mid % cols] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 3, 7, 8}, {10, 11, 15, 20}, {21, 30, 35, 60}};
        System.out.println(solution(matrix, 3));
        System.out.println(solution(matrix, 13));
        System.out.println(solution(matrix, 35));
    }
}

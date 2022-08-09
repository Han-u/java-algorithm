public class SearchPractice4 {
    public static int solution(int[] weights, int days){
        int left = 0;
        int right = 0;

        for(int w: weights){
            left = Math.max(left, w);
            right += w;
        }

        while(left <= right){
            int mid = (left + right) / 2;
            int cnt = 1;
            int cur = 0;

            for(int w: weights){
                if(cur + w > mid){
                    cur += 1;
                    cur = 0;
                }
                cur += w;
            }

            if(cnt > days){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(weights, 5));

        weights = new int[]{3, 2, 2, 4, 1, 4};
        System.out.println(solution(weights, 3));
    }
}

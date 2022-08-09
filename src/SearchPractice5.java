public class SearchPractice5 {
    public static int solution(int[] nums, int m){
        int left = 0;
        int right = 0;

        for(int num: nums){
            left = Math.max(num, left);
            right += num;
        }

        if(m == 1){
            return right;
        }

        while(left <= right){
            int mid = (left + right) / 2;
            int cnt = 1;
            int total = 0;

            for(int num: nums){
                total += num;
                if(total > mid){
                    total = num;
                    cnt++;
                }
            }

            if(cnt <= m){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] nums = {7, 2, 5, 10, 8};
        System.out.println(solution(nums, 2));

        nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(nums, 2));

        nums = new int[]{1, 4, 4};
        System.out.println(solution(nums, 3));
    }
}

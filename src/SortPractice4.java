// 정수배열 오름차순 정렬위해 정렬 필요한 구간의 길이 출력

public class SortPractice4 {
    public static int solution(int[] nums){
        if(nums == null || nums.length < 2){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int firstIdx = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            min = Math.min(min, nums[i]);
            if(nums[i] > min){
                firstIdx = i;
            }
        }
        int max = Integer.MIN_VALUE;
        int lastIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if(nums[i] < max){
                lastIdx = i;
            }
        }
        return lastIdx - firstIdx + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 5, 3, 9, 10};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 9, 3, 4, 5};
        System.out.println(solution(nums));

        nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(nums));
    }
}

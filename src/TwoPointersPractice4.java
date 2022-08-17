import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointersPractice4 {
    public static ArrayList<ArrayList<Integer>> solution(int[] nums){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || i > 0 && nums[i] != nums[i - 1]){
                int p1 = i + 1;
                int p2 = nums.length - 1;
                int sum = 0 - nums[i];

                while(p1 < p2){
                    if(nums[p1] + nums[p2] == sum){
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[p1], nums[p2])));

                        while(p1 < p2 && nums[p1] == nums[p1 + 1]){
                            p1++;
                        }

                        while(p1 < p2 && nums[p2] == nums[p2 - 1]){
                            p2--;
                        }

                        p1++;
                        p2--;
                    }else if(nums[p1] + nums[p2] < sum){
                        p1++;
                    }else{
                        p2--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution(nums));

        nums = new int[]{1, -7, 6, 3, 5, 2};
        System.out.println(solution(nums));
    }
}

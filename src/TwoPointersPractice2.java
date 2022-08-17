import java.util.Arrays;
import java.util.HashSet;

public class TwoPointersPractice2 {
    public static int[] solution(int[] nums1, int[] nums2){
        HashSet <Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0;
        int p2 = 0;

        while(p1 < nums1.length && p2 < nums2.length){
            if (nums1[p1] < nums2[p2]){
                p1++;
            }else if (nums1[p1] > nums2[p2]){
                p2++;
            }else{
                set.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int[] result = new int[set.size()];
        int idx = 0;
        for(Integer n : set){
            result[idx++] = n;
        }

        return result;
    }
    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(solution(nums1, nums2)));
    }
}

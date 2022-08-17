public class GreedyPractice1 {
    //각 원소 값은 해당 위치에서 오른쪽으로 이동할 수 있는 최대 값
    // 첫 번째 위치에서 시작해 가장 끝까지 이동이 가능한지 판별

    public static boolean solution(int[] nums){
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pos < i){ // 현재 포지션이 보다 작으면
                return false;
            }else if (pos >= nums.length - 1){ // 도달
                return true;
            }
            pos = Math.max(pos, i + nums[i]); // 매 자리에서 갈 수 있는 최대 위치
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums={2,3,0,1,4};
        System.out.println(solution(nums));

        nums = new int[]{3,0,0,1,1};
        System.out.println(solution(nums));

        nums = new int[]{3,2,1,0,4};
        System.out.println(solution(nums));
    }
}

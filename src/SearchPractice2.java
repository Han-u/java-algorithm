public class SearchPractice2 {
    // 원형 정렬 상태 배열에서 이진탐색
    // 이진 탐색으로 데이터 찾기
    // O(logn) 유지
    public static int solution(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int left = 0;
        int right= arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(arr[left] <= arr[mid]){
                if (target >= arr[left] && target < arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target > arr[mid] && target <= arr[right]){
                    left = mid + 1;
                } else{
                    right = mid - 1;
                }
            }
        }


        return -1;
    }

    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 8, 0, 1, 2};
        System.out.println(solution(nums,0));
        System.out.println(solution(nums,3));
    }
}

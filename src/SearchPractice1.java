public class SearchPractice1 {
    //target값이 arr내에 있으면 해당 인덱스 반환
    // 없으면 해당 값이 있을 경우의 위치에 -1를 곱하고 1을 뺀 값을 반환
    public static int solution(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if (target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -left - 1;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};
        System.out.println(solution(arr, 30));
        System.out.println(solution(arr, 3));
        System.out.println(solution(arr, 11));
        System.out.println(solution(arr, 35));
    }
}

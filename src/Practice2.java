import java.util.Arrays;

public class Practice2 {
    public static void solution(int[] arr){
        if(arr == null || arr.length < 2){
            return ;
        }
        int idx = - 1;
        for (int i = arr.length -1; i >= 1; i--) { // 모든 인덱스 순회
            if(arr[i] < arr[i - 1]){ // 바꿔줄 대상찾기
                idx = i - 1;
                break;
            }
        }

        if(idx == -1){ // 정렬된 상태
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = arr.length - 1; i > idx ; i--) {
            if(arr[i] < arr[idx] && arr[i] != arr[i-1]){ // 바꿀대상보다 작고 왼쪽값과 같지않음
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {3, 2, 1};
        solution(arr);

        arr = new int[]{1, 9, 4, 7, 6};
        solution(arr);

        arr = new int[]{1, 1, 2, 3};
        solution(arr);
    }
}

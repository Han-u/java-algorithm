import java.util.Arrays;

/*
배열에 3가지 색으로 구분되는 데이터들
0 흰 1 파랑 2 빨강
흰색부터 빨강순으로 인접하게 정렬해 출력
 */
public class SortPractice1 {
    public static void solution(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }

        int[] cntArr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            cntArr[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < cntArr.length; i++) {
            while(cntArr[i] > 0){
                arr[idx++] = i;
                cntArr[i] -= 1;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution(arr);
        System.out.println(Arrays.toString(arr));

        arr= new int[]{2, 0, 1};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}

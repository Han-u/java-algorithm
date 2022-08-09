import java.util.Arrays;

public class ShellSort {
    /*
    셸 정렬:
    - 삽입 정렬 약점 보완한 정렬 방식
    - 약점:
        오름차순 정렬 기준, 내림차순 구성된 데이터에 대해서는 앞 데이터와 비교하며 모두 교환
    - 이전 모든 데이터와 비교하지 않고 일정 간격 두어 비교
    - O(n^2)
        간격 석정에 따라 worst는 삽입정렬과 동일, 일반적으로는 삽입에 비해 빠름
     */
    public static void shellSort(int[] arr){
        int gap = arr.length / 2;
        for (int g = gap; g > 0 ; g /= 2) {
            for (int i = g; i < arr.length; i++) {
                int tmp = arr[i];

                int j = 0;
                for (j = i - g; j >= 0; j -= g) {
                    if(arr[j] > tmp){
                        arr[j + g] = arr[j];
                    }else{
                        break;
                    }
                }
                arr[j + g] = tmp;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 32, 52, 27, 48, 17, 99, 56};
        shellSort(arr);
        System.out.println("셸 정렬: " + Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        /*
            퀵 정렬:
            - 임의의 기준 값을 정하고 그 값을 기준으로 좌우로 분할하며 정렬
            - O(n^2) - 기준 값이 최소값 또는 최대값으로 지정되는 경우
         */
        if(left >= right){
            return;
        }
        int pivot = partition(arr,left,right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i < j){
            while(arr[j] > pivot && i < j){
                j--;
            }
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, left, i);

        return i;
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 2, 7, 1, 4};
        quickSort(arr, 0, arr.length-1);
        System.out.println("퀵 정렬: " + Arrays.toString(arr));
    }
}

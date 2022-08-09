import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] arr){
        /*
            힙 정렬:
            - 힙 자료구조 형태의 정렬 방식
            - 기존 배열을 최대 힙으로 구조 변경 후 정렬 진행
            - O(nlogn)
         */

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0 ; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    public static void heapify(int[] arr, int parentIdx, int size){
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int maxIdx = parentIdx;

        if(leftIdx < size && arr[maxIdx] < arr[leftIdx]){
            maxIdx = leftIdx;
        }

        if(rightIdx < size && arr[maxIdx] < arr[rightIdx]){
            maxIdx = rightIdx;
        }

        if(parentIdx != maxIdx){
            swap(arr, maxIdx, parentIdx);
            heapify(arr, maxIdx, size);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 2, 7, 1, 4};
        heapSort(arr);
        System.out.println("힙 정렬: " + Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int[] tmp, int left, int right){
        /*
            합병 정렬:
            - 배열을 계속 분할해서 길이가 1이 되도록 만들고 인접부분끼리 정렬하면서 합병
            - O(nlogn)
         */
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, tmp, left, mid);
            mergeSort(arr, tmp, mid + 1, right);
            merge(arr, tmp, left, right, mid);
        }
    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid){
        int p = left;
        int q = mid + 1;
        int idx = p;

        while(p <= mid || q <= right){
            if (p<= mid && q <= right){
                if(arr[p] <= arr[q]){
                    tmp[idx++] = arr[p++];
                }else{
                    tmp[idx++] = arr[q++];
                }
            }else if(p <= mid && q > right){
                tmp[idx++] = arr[p++];
            }else{
                tmp[idx++] = arr[q++];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 2, 7, 1, 4};
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length -1);
        System.out.println("합병 정렬: " + Arrays.toString(arr));
    }
}

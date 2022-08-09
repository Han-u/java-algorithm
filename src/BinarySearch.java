public class BinarySearch {
    /*
    이진 탐색:
        - 정렬된 상태의 데이터에서 특정 값을 빠르게 ㅏㅌㅁ색
        - 찾고자 하는 값과 데이터 중앙 값을 비교 후
        - 대상이 더 작으면 왼쪽에서 이진 탐색
        - 대상이 더 크면 오른쪽에서 이진 탐색
        - O(logn)
     */
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<= right){
            int mid = (left + right) / 2;

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int target, int left, int right){
        if (left > right){
            return -1;
        }

        int mid = (left + right) / 2;

        if(target == arr[mid]){
            return mid;
        }else if (target < arr[mid]){
            return binarySearch2(arr, target, left, mid - 1);
        }else{
            return binarySearch2(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};

        System.out.println("Index: "+ binarySearch(arr, 30));
        System.out.println("Index: "+ binarySearch2(arr, 30, 0, arr.length - 1));
    }
}

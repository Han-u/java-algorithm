import java.util.Arrays;

public class Sort {
    /*
    정렬:
        - 특정 값을 기준으로 데이터를 순서 배치
        - 구현 쉽고 속도 느림: 버블, 삽입, 선택
        - 구현 어렵고 속도 빠름: 합병, 힙, 퀵, 트리
        - 하이브리드 정렬: 팀, 블록 병합, 인트로
        - 기타: 기수, 카운팅, 셸, 보고
     */

    public static void bubbleSort(int[] arr){
        /*
             버블:
            - 인접한 데이터를 비교하며 자리를 바꿈
            - O(n^2)
         */
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        /*
            삽입:
            - 앞의 데이터를 정렬해가면서 삽입 위치를 찾아 정렬
            - O(n^2)
         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else{
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        /*
            선택:
            - 최소 또는 최대 값을 찾아서 가장 앞 또는 뒤부터 정렬
            - O(n^2)
         */
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int max = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[max]){
                    max = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
        }
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 2, 7, 1, 4};
        bubbleSort(arr);
        System.out.println("버블 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        insertionSort(arr);
        System.out.println("삽입 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        selectionSort(arr);
        System.out.println("선택 정렬: " + Arrays.toString(arr));
    }
}

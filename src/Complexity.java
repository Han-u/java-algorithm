public class Complexity {
    static int fibonacci(int n){
        if(n < 3){
            return 1;
        }
        return fibonacci(n - 2) * fibonacci(n - 1);
    }

    static int factorial(int n){
        if (n < 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        /*
        * 시간 복잡도:
        *   알고리즘의 필요 연산 횟수
        * */

        // 1. O(1)
        System.out.println("hello");


        // 2. O(logN)
        for (int i = 1; i < 16; i*=2) {
            System.out.println("hello");
        }


        // 3. O(N)
        for (int i = 0; i < 2; i++) {
            System.out.println("hello");
        }


        // 4. O(NlogN)
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 8; j++) {
                System.out.println("hello");
            }
        }

        // 5. O(N^2)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("hello");
            }
            System.out.println();
        }


        // 6. O(2^N)
        // 피보나치 재귀
        System.out.println(fibonacci(6));



        /*
        * 공간 복잡도:
        *   알고리즘의 필요 메모리
        * */
        // 1. O(N)
        int n = 3;
        System.out.println(factorial(n));


        // 2. O(1)
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}

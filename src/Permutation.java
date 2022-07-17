import java.util.stream.IntStream;

public class Permutation {
    public static void main(String[] args){

        // 1. 팩토리얼
        int n = 5;
        int result = 1;

        for(int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("result = " + result);
        System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> (x * y)));


        /*
        * 2. 순열: 순서 정해서 나열
        * 서로다른 n개중에 r개선택 (순서O, 중복X)
        * nPr = n! / n-r!
        *
        */
        n = 5;
        int r = 3;
        result = 1;

        for (int i = n; i >= n - r + 1; i--){
            result *= i;
        }


        /*
        * 3. 중복 순열
        * 서로다른 n개중에 r개선택 (순서O, 중복O)
        * nπr = n^r
        */
        n = 4;
        r = 2;
        result = 1;

        for(int i = 0; i < r; i++){
            result *= n;
        }
        System.out.println("result = " + result);
        System.out.println(Math.pow(n, r));


        /*
        * 4. 원순열
        * 원모양 테이블에 n개의 원소를 나열하는 경우의 수
        * n!/n = (n-1)!
        * */
        n = 3;
        result = 1;

        for(int i = 1; i < n; i++){
            result *= i;
        }
        System.out.println("result = " + result);

    }
}

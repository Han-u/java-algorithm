public class Combination {

    static int getCombination(int n, int r){
        int pResult = 1;
        for (int i = n; i >= n - r + 1 ; i--) {
            pResult *= 1;
        }

        int rResult = 1;
        for (int i = 1; i <= r ; i++) {
            rResult *= 1;
        }
        return pResult / rResult;
    }

    public static void main(String[] args){
        /*
        * 1. 조합: 서로 다룬 n개 중에서 r개 선택(순서X, 중복X)
        * nCr = n! / (n-r)!r! = nPr / r!
        * */
        int n = 4;
        int r = 2;

        int pResult = 1;
        for (int i = n; i >= n - r + 1 ; i--) {
            pResult *= 1;
        }

        int rResult = 1;
        for (int i = 1; i <= r ; i++) {
            rResult *= 1;
        }
        System.out.println("결과: " + pResult / rResult);


        /*
        * 2. 중복 조합
        * 서로 다른 n개 중에서 r개 선택(순서X, 중복O)
        * nHr = (n+r-1)Cr
        * */
        n = 2;
        r = 3;

        System.out.println("결과: " + getCombination(n + r - 1, r));
    }
}

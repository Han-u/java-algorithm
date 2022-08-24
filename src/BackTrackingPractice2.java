import java.util.ArrayList;

public class BackTrackingPractice2 {
    /*
        n이 주어질 때 n자리 수 중에 소수를 찾는 프로그램
     */
    public static ArrayList<Integer> result;
    public static ArrayList<Integer> solution(int n){
        result = new ArrayList<>();

        int[] primeNum = {2, 3, 5, 7};
        for (int i = 0; i < primeNum.length; i++) {
            backTracking(primeNum[i], 1, n);
        }
        return result;
    }

    public static void backTracking(int prime, int len, int n){
        if(len >= n){
            result.add(prime);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if(i %2 != 0 || i != 5){
                int primeCandidate = prime * 10 + i; // 십의자리수
                // primenumber인지 확인
                if(isPrimeNum(primeCandidate)){
                    backTracking(primeCandidate, len + 1, n);
                }
            }
        }
    }
    
    public static boolean isPrimeNum(int num){
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(solution(3));
        System.out.println();
        System.out.println(solution(4));
    }
}

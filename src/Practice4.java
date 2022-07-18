import java.util.HashSet;

public class Practice4 {
    public static boolean solution(int n){
        HashSet<Integer> set = new HashSet<>(); // 중간 결과물 저장

        while(set.add(n)) { // 결과물 반복해서 저장
            int squareSum = 0;

            while (n > 0) {
                int remain = n % 10;
                squareSum += remain * remain;
                n /= 10; // 십의자리 -> 일의자리
            }

            if (squareSum == 1) {
                return true;
            } else {
                n = squareSum;
            }
        }
        return false;
    }


    public static void main(String[] args){
        System.out.println(solution(19));
        System.out.println(solution(2));
        System.out.println(solution(61));
    }
}

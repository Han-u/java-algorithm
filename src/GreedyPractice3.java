public class GreedyPractice3 {
    // n이 짝수면 2로 나누기 연산
    // n이 홀수면 1을 더하거나 뺌
    // n이 1이 되는데 필요한 최소한의 연산 횟수
    public static int solution(int n){
        if(n == 0 || n == 2){
            return 1;
        }

        if (n == 1){
            return 0;
        }

        int cnt = 0;
        while (n != 1){
            if(n == 3){
                cnt += 2;
                break;
            }

            if(n % 2 == 0){
                n /= 2;
            } else if((n + 1) % 4 == 0){
                n += 1;
            } else if((n - 1) % 4 == 0){
                n -= 1;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args){
        System.out.println(solution(8));
        System.out.println(solution(7));
        System.out.println(solution(9));
        System.out.println(solution(6));
    }
}

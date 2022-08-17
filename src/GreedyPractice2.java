public class GreedyPractice2 {
    // 양의 정수 배열
    // 각 원소는 날짜별 주식 가격
    // 한 번에 한 주만 보유 가능
    // 얻을 수 있는 최대 수익 반환

    public static int solution(int[] prices){
        if(prices == null || prices.length < 2){
            return 0;
        }

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] prices = {5, 1, 6, 4, 3, 5};
        System.out.println(solution(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(prices));

        prices = new int[]{5, 4, 3, 2, 1};
        System.out.println(solution(prices));
    }
}

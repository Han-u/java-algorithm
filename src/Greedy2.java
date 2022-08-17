import java.util.HashMap;
import java.util.Map;

public class Greedy2 {
    public static void getChangeCoins(int receiveMoney, int price){
        final int[] coins = {500, 100, 50, 10, 5, 1};
        HashMap<Integer, Integer> result = new HashMap<>();

        int change = receiveMoney - price;
        int cnt = 0;

        for (int i = 0; i < coins.length; i++) {
            if(change < coins[i]){
                continue;
            }
            int q = change / coins[i];
            result.put(coins[i], result.getOrDefault(coins[i], 0) + q);

            change %= coins[i];
            cnt += q;
        }

        System.out.println("거스름돈 동전 개수: " + cnt);
        for(Map.Entry<Integer, Integer> cur : result.entrySet()){
            System.out.println(cur.getKey() + ": " + cur.getValue());
        }
    }

    public static void main(String[] args){
        getChangeCoins(1000, 100);
        getChangeCoins(1234, 500);
    }
}

public class GreedyPractice4 {
    // 원형 루트 상에 n개의 주유소 있다
    // gas: 각 주유소 가스 보유량
    // cost: 해당 주유소에서 다음 주유소로 이동비용
    // 어디서 가스채워 출발하면 모든 주유소 방문 가능한지 계산하시오

    public static int solution(int[] gas, int[] cost){
        if (gas == null || cost == null){
            return -1;
        }

        if(gas.length != cost.length){
            return -1;
        }

        int curGas = 0;
        int totalGas = 0;
        int startPos = 0;

        for (int i = 0; i < gas.length; i++) {
            curGas += gas[i] = cost[i];
            totalGas += gas[i] - cost[i];

            if(curGas <0){
                startPos = i + 1;
                curGas = 0;
            }
        }
        return totalGas >= 0 ? startPos : -1;
    }

    public static void main(String[] args){
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(solution(gas, cost));

        gas = new int[]{2, 3, 4};
        cost = new int[]{3, 4, 3};
        System.out.println(solution(gas, cost));
    }
}

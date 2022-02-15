package programmers.level2;

public class PG_LV2_주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_LV2_주식가격 method = new PG_LV2_주식가격();
        int[] prices = {1, 2, 3, 2, 3};
        int[] results = method.solution(prices);
        for (int price : results) {
            System.out.println(price);
        }
    }
}

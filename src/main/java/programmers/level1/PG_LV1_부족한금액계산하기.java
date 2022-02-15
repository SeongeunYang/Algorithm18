package programmers.level1;

public class PG_LV1_부족한금액계산하기 {
    public long calMoney(int price, int money, int count) {
        //등차 수열 공식 이용 a, d = price, n=count로 계산
        long fee = (long) count * price * (count + 1) / 2 - money;
        return (fee <= 0) ? 0 : fee;
    }

    public static void main(String[] args) {
        PG_LV1_부족한금액계산하기 calculation = new PG_LV1_부족한금액계산하기();
        long amountMoney = calculation.calMoney(3, 20, 4);
        System.out.println(amountMoney);
    }
}
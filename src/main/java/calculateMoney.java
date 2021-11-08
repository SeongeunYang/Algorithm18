//부족한 금액 계산하기
public class calculateMoney {
    public long calMoney(int price, int money, int count) {
        long fee = (long) count * price * (count + 1) / 2 - money; //등차 수열 공식 이용
        return (fee <= 0) ? 0 : fee;
    }

    public static void main(String[] args) {
        calculateMoney calculation = new calculateMoney();
        long amountMoney = calculation.calMoney(3, 20, 4);
        System.out.println(amountMoney);
    }
}
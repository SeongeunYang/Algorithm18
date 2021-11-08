public class OddEven {
    public String Check(int num){
        return (num%2 == 0)? "Even" : "Odd";
    }

    public static void main(String[] args) {
        OddEven OddEven_method = new OddEven();
        String result = OddEven_method.Check(4);
        System.out.println(result);
    }
}

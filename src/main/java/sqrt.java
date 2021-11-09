public class sqrt {
    public long solution(long n) {
        double sqrt_num = Math.sqrt(n);
        if (sqrt_num % 1 == 0) {
            return (long) Math.pow(sqrt_num + 1, 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        sqrt method = new sqrt();
        System.out.println(method.solution(121));
    }
}

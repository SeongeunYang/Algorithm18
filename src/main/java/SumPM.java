public class SumPM {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += absolutes[i] * ((signs[i]) ? 1 : -1); //숫자에 부호 곱해줘서 더하기!
        }
        return sum;
    }

    public static void main(String[] args) {
        SumPM method = new SumPM();
        int[] arr1 = {4, 7, 12};
        boolean[] arr2 = {true, false, true};
        int result = method.solution(arr1, arr2);
        System.out.println(result);
    }
}
import java.util.Arrays;

public class SortIntArray {
    public long solution(long n) {
        char[] numArray = String.valueOf(n).toCharArray();//각 자릿수를 분리하여 배열에 저장
        Arrays.sort(numArray);// 오름차순 소팅
        StringBuilder Answer = new StringBuilder(new String(numArray));//다시 스트링으로 만들고 StringBuilder로 반전하기

        return Long.parseLong(Answer.reverse().toString());
    }

    public static void main(String[] args) {
        SortIntArray method = new SortIntArray();
        System.out.println(method.solution(118372));
    }
}

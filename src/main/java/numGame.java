public class numGame {
    public int solution(String s) {
        String[] num_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < num_str.length; i++) {
            s = s.replace(num_str[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        numGame method = new numGame();
        System.out.println(method.solution("one4seveneight"));
    }
}

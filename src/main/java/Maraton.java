import java.util.Arrays;

public class Maraton {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;

        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return  participant[i];
            }
        }

        return participant[i];
    }

    public static void main(String[] args) {
        Maraton method = new Maraton();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        System.out.println(method.solution(participant, completion));
    }
}

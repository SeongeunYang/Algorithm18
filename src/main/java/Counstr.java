public class Counstr {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count_p = (int) s.chars().filter(c -> c == 'p').count();
        int count_y = (int) s.chars().filter(c -> c == 'y').count();
        return count_p == count_y;
    }

    public static void main(String[] args) {
        Counstr method = new Counstr();
        System.out.println(method.solution("Pyy"));
    }
}

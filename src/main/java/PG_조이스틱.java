public class PG_조이스틱 {
    public int solution(String name) {
        int minJoy = 0;
        String[] nameAlpa = name.split("");

        // 첫번째 글자
        minJoy += Math.min(nameAlpa[0].charAt(0) - 'A', '[' - nameAlpa[0].charAt(0));
        int prev = 0;
        int current = 1;
        int finished = 1;

//        while (finished != nameAlpa.length) {
//            int next = 1;
//            if (!nameAlpa[current].equals("A")) {
//                if (prev + 1 < current - prev) {
//                    next = nameAlpa.length - 1;
//                } else {
//                    next = current + 1;
//                }
//                minJoy += Math.min(nameAlpa[current].charAt(0) - 'A', '[' - nameAlpa[current].charAt(0));
//                prev = current;
//            }
//            current += next;
//            finished += 1;
//        }

        return minJoy;
    }

    public static void main(String[] args) {
        PG_조이스틱 method = new PG_조이스틱();
        System.out.println(method.solution("JEROEN"));
//        System.out.println(method.solution("JAZ"));
    }
}

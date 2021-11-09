public class createOddString {
    public String solution(String s) {
        String[] str_list = s.split("");
        int cnt = 0 ;

        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals(" ")){
                cnt=0;
            } else{
                str_list[i] = (cnt % 2 == 0) ? str_list[i].toUpperCase() : str_list[i].toLowerCase();
                cnt++;
            }
        }

        return String.join("", str_list);
    }

    public static void main(String[] args) {
        createOddString method = new createOddString();
        System.out.println(method.solution("Ab Ab Ab Ab"));
    }
}

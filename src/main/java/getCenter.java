public class getCenter {
    public String centerString(String s) {
        int index = s.length() / 2;
        return (s.length() % 2 == 0) ? s.substring(index-1, index + 1) : s.substring(index, index+1);
    }

    public static void main(String[] args) {
        getCenter method = new getCenter();
        String result = method.centerString("abcdef");
        System.out.println(result);
    }
}

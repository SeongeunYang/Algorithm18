public class stringToInt {
    public int changeToInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        stringToInt method = new stringToInt();
        int result = method.changeToInt("1234");
        System.out.println(result);
    }
}

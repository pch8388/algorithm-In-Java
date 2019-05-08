package lecture.recursion;

public class StringLength {
    private static int length(String str) {
        if ("".equals(str)) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(length("hello world"));
    }
}

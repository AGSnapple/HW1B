public class Main {
    public static void main(String[] args) {
        String str = "make install";
        System.out.println(strreverse(str));
    }

    public static String strreverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
public class Palindrome {


    private static boolean isPalindrome(String str) {
        str = str.replaceAll("\\W+", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
//        String s = "never odd or even";
        String s = "eye";
        System.out.println(isPalindrome(s));
    }
}

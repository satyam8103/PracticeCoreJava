public class StringPalindrome {
    public static void main(String[] args) {
        String str = "nkaz" +
                "kn";
        String rev = "";
        boolean ans =false ;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
            if (ans == true){
                System.out.println("String is palindrome");
            }
            else{
                System.out.println("String is not palindrome");
            }
    }
}

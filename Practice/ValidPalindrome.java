public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));

    }
        public static boolean isPalindrome(String s) {
            if(s.equals(" ")){
                return true;
            }

            int left =0;
            String a = s.trim().toLowerCase();
            char[] arr  = a.toCharArray();
            int right = a.length()-1;

            while(left<right){
                if(arr[left]==arr[right]){
                    left++;
                    right--;
                    System.out.print(arr);
                }
                else{
                    return false;
                }
                return true;
            }
            return true;
        }
    }


import java.util.HashMap;
import java.util.Map;

public class romanToInteger {

    public static void main(String[] args) {
        String s = "III";
                int res = 0;
                Map<Character, Integer> roman = new HashMap<>();
                roman.put('I', 1);
                roman.put('V', 5);
                roman.put('X', 10);
                roman.put('L', 50);
                roman.put('C', 100);
                roman.put('D', 500);
                roman.put('M', 1000);



                for (int i = 0; i < s.length() - 1; i++) {
                    if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                        res -= roman.get(s.charAt(i));
                        System.out.println(s.charAt(i));
                    } else {
                        res += roman.get(s.charAt(i));
//                        System.out.println(res);
                        System.out.println(s.charAt(i));
                    }
                }
                System.out.println(0-'I');
                System.out.println(res + roman.get(s.charAt(s.length() - 1)));
            }
        }


import java.util.HashMap;
import java.util.Map;
public class hashMapEx1 {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Math", 85);
            map.put("Science", 90);
            map.put("English", 78);

            // Iterating using entrySet
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Subject: " + entry.getKey() + ", Marks: " + entry.getValue());
            }
        }
    }



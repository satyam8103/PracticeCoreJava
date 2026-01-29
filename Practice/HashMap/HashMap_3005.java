package HashMap;
import java.util.HashMap;
import java.util.Map;
public class HashMap_3005 {
        public int maxFrequencyElements(int[] nums) {
            int sum = 0;
            int s=0;
            int max = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0 ; i<nums.length ; i++){
                int n = nums[i];
                map.put(n , map.getOrDefault(n , 0) + 1);
            }
            for (Map.Entry<Integer , Integer> i : map.entrySet()){
                if(i.getValue() > max){
                    max= i.getValue();
                }
                if(i.getValue()>=max){

                }else if(i.getValue() > 1){
                    sum = sum + i.getValue();
                }
                if(i.getValue() == 1){
                    s = s + i.getValue();

                }
            }
            if(s == nums.length){
                return s;
            }else {
                return sum;
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,2,3,1,4};
    }
}

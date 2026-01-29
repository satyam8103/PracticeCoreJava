package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String>answer = new ArrayList<>();
            for(int i = 1;i<=n;i++){
                if(n%3==0 && n%5==0){
                    answer.add("FizzBuzz");
                }
                else if(n%3==0){
                    answer.add("Fizz");
                }
                else if(n%5==0){
                    answer.add("Buzz");
                }
                else{
                    answer.add(i + " ");
                }
            }
            return answer;

        }
    }
}

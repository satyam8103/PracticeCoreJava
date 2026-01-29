package Durgesh;

public class DuplicateStringOccurences {
    public static void main(String[] args) {
        String str = "shekhar";
        char ch = 'h';
        int count =0;
        for(int i =0;i<str.length();i++){
            char[] charArray = str.toCharArray();
            if(charArray[i] == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}

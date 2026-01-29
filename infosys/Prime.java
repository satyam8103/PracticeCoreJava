public class Prime {
    public static void main(String[] args) {
        System.out.print(1+" ");
        for (int i = 1; i < 50; i++) {
            int count =0;
            for(int num = i ;num>=1; num--){
                if(i%num==0){
//                    ans = true;

                    count++;
                }
            }
            if(count ==2){
                System.out.print(i+" ");
            }

        }
    }
}

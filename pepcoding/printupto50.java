public class printupto50 {
    public static void main(String[] args) {
        boolean flag  =false;
        int count= 0;
//        int arr[] ={};
//        System.out.print(1+" ");
        int i;
        for( i =1;i<50;i++){
            for(int j = i;j>=1;j--){
                if(i%j==0){
                    count++;
//                    break;
//                   arr[j] = i;

                }

            }

        }
        if(count ==2){
            System.out.print(i+" ");


        }

    }
}

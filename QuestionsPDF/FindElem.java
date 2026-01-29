//import java.util.Scanner;
//
//public class FindElem {
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,5};
//
//        Scanner sc= new Scanner(System.in);
//        int key = sc.nextInt();
//        boolean flag = false;
//
//        for(int i = 0;i< arr.length;i++) {
//          if(arr[i] == key){
//              flag =true;
//              System.out.println("found");
//                break;
//            }
//        }
//        if (flag == true){
//            System.out.println("found");
//        }
//        else {
//            System.out.println("not found");
//        }
//    }
//
//}


import java.util.Scanner;

public class FindElem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = true;
                if (flag == true) {
                    System.out.println("found");
                }
            }
            else {
                System.out.println("not found");
            }


        }
    }
}
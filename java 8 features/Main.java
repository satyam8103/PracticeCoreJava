import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ArrayList <Integer> list = new ArrayList<>();
//        list = Arrays.asList(10,20);
          List<Integer> list = Arrays.asList(10,20,30,10);

//    list.forEach((name)->{
//        System.out.println(name);
//    });

//        System.out.println(list.get(0));

//            list.forEach((name2)->{
//
//            if(name2 == 10){
//                System.out.println(name2);
//            }
//        });




    for(int i = 0;i< list.size();i++) {
        int first = list.get(i);
        for (int j = i + 1; j < list.size(); j++) {
            if (first == list.get(j))
                System.out.println(first);
        }
    }
////        System.out.println(list.get(0));
//    }

//        int arr[]= {10,20,30,10};
//        for(int i =0;i< arr.length;i++){
//            int temp = arr[i];
//            for(int j = i+1;j<arr.length;j++){
//                if(temp  ==arr[j]){
//                    System.out.println(arr[j]);
//                }
//            }
//        }


    }

}

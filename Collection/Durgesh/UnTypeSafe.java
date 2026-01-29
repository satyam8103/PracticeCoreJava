package Durgesh;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class UnTypeSafe {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("name is satyam");
        list.add("age is : "+20);
        list.add("Marks is : "+90);
        list.add("name is satyam");
        System.out.println(list.get(0));
        System.out.println(list.get(3));

        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("satyam");
        arrayList.add("Roshini");
        arrayList.add("shekhar");
        arrayList.remove(1);
//        System.out.println(arrayList);
//        arrayList.get(1);
//        System.out.println(arrayList.clone());
//        System.out.println(arrayList.indexOf("satyam"));
//        System.out.println(arrayList.hashCode());
//        System.out.println(arrayList.contains("satyam"));
//        System.out.println(arrayList.removeAll(arrayList));
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.set(1,"arpit"));
//        System.out.println(arrayList);
//
        Vector <String> vector = new Vector<>();
        vector.addAll(arrayList);
//        System.out.println(vector);
        Enumeration e = vector.elements();
        System.out.println(e.getClass());
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

}

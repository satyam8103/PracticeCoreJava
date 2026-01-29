package BasicProgramCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyStringArray {
    public static void main(String[] args) {
        String geeks[] = {"satyam","Shekhar","Arpit"};
//        String string = "satyam";

        List<String> list = new ArrayList<>();
        list.add("18");
        list.add("55");
        list.add("28");
        Collections.addAll(list,geeks);
        System.out.println(list);
    }
}

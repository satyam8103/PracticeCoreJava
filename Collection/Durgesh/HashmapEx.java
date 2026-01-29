package Durgesh;

import java.util.HashMap;

public class HashmapEx {
    public static void main(String[] args) {
        HashMap<String,Integer>courses = new HashMap<>();
        courses.put("core Java",4000);
        courses.put("Basic python",400);
        courses.put("Android Dev",3000);
        courses.put("Spring",8000);
        courses.put("Spring",8000);
        courses.put("Spring",800);
        System.out.println(courses);
        courses.forEach((key,value)->{
            System.out.println(key+ ": "+ value);
        });
    }
}

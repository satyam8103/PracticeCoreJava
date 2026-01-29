import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotThreadSafeEx {
    public static void main(String[] args) {
        List<String>list =new CopyOnWriteArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        Runnable t1 =()->{
            for(String str: list){
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Runnable t2=()->{
            list.add("new item");
            list.add("new item");
            list.add("new item");
        };
        new Thread(t2).start();
        new Thread(t1).start();

    }
}

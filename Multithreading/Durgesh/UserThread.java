package Durgesh;

public class UserThread extends Thread{
    public void run(){
        System.out.println("this is user defined thread");
    }

}
class ThreadOp{
    public static void main(String[] args) {
        System.out.println("program Started...");
        int x =56+34;
        System.out.println("sum is "+x);
        Thread t = Thread.currentThread();
        String tName = t.getName();
//        System.out.println("current running thread "+tName);
        t.setName("my main");;
        System.out.println(t);
        System.out.println(t.getName());
        try{
                Thread.sleep(5000);
        }
        catch (Exception e ){
            System.out.println("thread interrupted");
        }
        finally {
            System.out.println("5 sec completed");
        }
        System.out.println(t.getId());
        System.out.println("program ended ");
       UserThread thread = new UserThread();
       thread.start();
    }
}

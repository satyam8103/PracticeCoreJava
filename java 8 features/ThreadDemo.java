public class ThreadDemo {
    public static void main(String[] args) {

        Runnable thread1 = () ->{
            for(int i =1;i<=10;i++){
                System.out.println("thread values" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.run();  //or
//        Thread t = new Thread(thread1);
//        t.setName("thread");
//        t.start();

        Runnable t2 =()->{
            try{
                for (int i =1;i<=10;i++){
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        t2.run();
    }
}

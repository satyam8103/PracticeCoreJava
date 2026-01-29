package ProducerConsumerProblem;

public class itemConsumer extends Thread{
    Company c ;
    itemConsumer(Company c) {
        this.c = c;
    }
    public void run(){
    while(true){
        this.c.consume_item();
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
        }
    }
}
}

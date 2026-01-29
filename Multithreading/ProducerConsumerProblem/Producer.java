package ProducerConsumerProblem;
public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c = c;
    }
    public void run(){
        int i= 1;
        while(true){
        try{
            this.c.produce_items(i);
            Thread.sleep(3000);
        }
        catch (Exception e){
        }
        i++;
    }

    }
}

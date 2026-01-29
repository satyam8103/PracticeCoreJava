package ProducerConsumerProblem;

public class Company {
    int n;
    boolean f = false;
    synchronized public void produce_items(int n) throws Exception{
        this.n = n;
        System.out.println("produced : "+ this.n); // produced 1 2 3
    }
    synchronized public int consume_item(){
        System.out.println("consumed :" + this.n);// consumed 1 2 3
        return this.n;
    }

}

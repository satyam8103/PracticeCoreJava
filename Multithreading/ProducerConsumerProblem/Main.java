package ProducerConsumerProblem;


import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Producer p =new Producer(company);
        itemConsumer c = new itemConsumer(company);
        p.start();
        c.start();
    }

}

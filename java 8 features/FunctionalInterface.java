public class FunctionalInterface {
    public static void main(String[] args) {
//        MyInter myInter = new MyInter() {
////            @Override
////            public void sayHello() {
////                System.out.println("helo");
////            }
////
////            @Override
////            public void sayHi() {
////                System.out.println("hi");
////            }
////        };
//
//        myInter.sayHello();
//        myInter.sayHi();




        MyInter i = () ->
            System.out.println("this is first time i am using lambda");

            i.sayHello();

        SumInterface sumInterface = (a,b) ->(a +b);

        System.out.println(sumInterface.add(2,4));

    }

}

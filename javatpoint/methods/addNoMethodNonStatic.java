class Adder1 {
    int add(int a, int b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class addNoMethodNonStatic {
    public static void main(String[] args) {
        Adder1 addRef = new Adder1();
        Adder1 addRef2 = new Adder1();

        // Call the add methods on the instances
        System.out.println(addRef.add(11, 22));
        System.out.println(addRef.add(11, 22, 23));
        System.out.println(addRef.add(98, 42));
        System.out.println(addRef2.add(98, 56.86));
        System.out.println(addRef2.add(98.664, 56.86));
    }
}

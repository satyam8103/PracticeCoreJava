package Durgesh;

public class LevelSabkeNiklenge {
    public enum Level{
        Low,Medium,High;
    }

    public static void main(String[] args) {
        Level myVar = Level.Low;

        switch (myVar){
            case Low -> System.out.println("Low level constant"); // no need to use break;
            case Medium -> System.out.println("Medium level constant");
            case High -> System.out.println("high level");

//            case Low : System.out.println("Low level constant"); // break is required and mandatory here
//            case Medium : System.out.println("Medium level constant");
//            case High : System.out.println("high level");
        }
    }
}

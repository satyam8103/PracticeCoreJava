package Durgesh;

public class EnumValues {
        public enum Month{
            JAN,FEB,mAR;
        }
        public static void main(String[] args) {
//           for (Month m :Month.values()){
//               System.out.println(m);
//           }
            System.out.println(Month.valueOf("JAN"));
            System.out.println(Month.valueOf("FEB").ordinal());
        }
    }


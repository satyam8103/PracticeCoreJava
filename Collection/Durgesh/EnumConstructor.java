package Durgesh;
public class EnumConstructor {
   public enum Month{
        JAN(1),FEB(2),mAR(3);
         int value;
          Month (int value){
              this.value = value;
        }
    }
    public static void main(String[] args) {
        for(Month m :Month.values()){
            System.out.println(m + " " + m.value);
        }
    }
}
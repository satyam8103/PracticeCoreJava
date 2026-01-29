abstract class Shape{
    abstract void draw();

}
  class rectangle extends  Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }

}
  class circle1 extends Shape{
    void draw(){
        System.out.println("draw circle");
    }
}
public class Abstraction_Shape {
    public static void main(String[] args) {
        Shape ref  = new circle1() ;
            ref.draw();

    }
}

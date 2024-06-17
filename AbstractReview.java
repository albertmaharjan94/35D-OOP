// Donot type this
// Find the bug in the following
public class AbstractReview {
    public static void main(String[] args) {
        // Computer c1 = new Computer();
    }
}
abstract class Computer{
    abstract void on();
    abstract String off(boolean val);
    void changePassword(){

    }
    abstract boolean usb(int num);
}
class AppleM1 extends Computer{
    @Override
    void on(){
        System.out.println("Computer on");
    }
    @Override
    String off(boolean val){
        return "Success";
    }
    @Override
    boolean usb(int num){
        return false;
    }
}

/*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Rectangle extends Shape{
    double length = 10;
    double breadth = 20;
    @Override
    double calculateArea(){
        return length * breadth;
    }
    @Override
    double calculatePerimeter(){
        return 2 * (length + breadth);
    }
}
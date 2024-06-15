public class InheritanceConstructor{
    public static void main(String[] args){
        TShirt ts1 = new TShirt();
        ts1.nameDifference("New");
        TShirt ts2 = new TShirt("My Shirt");

    }
}
class Shirt{
    String name = "Parent Shirt"; // super.name
    String type;
    Shirt(){
        System.out.println("Parent Constructor");
    }
    Shirt(String name){
        this.name = name;
        System.out.println("Parent Constructor with String params");
    }
}
class TShirt extends Shirt{
    String name = "Class shirt"; // this.name
    TShirt(){
        // default parent constructor is called automatically
        // super() or Shirt()
        super("Parent Name");
        System.out.println("Child Constructor");
    }
    // Overloading
    // Same name function with different logic/ parameters
    TShirt(String name){
        this.name = name;
        System.out.println("Constructor with String params");
    }
    TShirt(int number){

    }
    TShirt(String name, int number){

    }

    void nameDifference(String name){
        System.out.println("Param name " + name);
        System.out.println("Class name " + this.name);
        System.out.println("Parent name " + super.name);
    }
}

// Make a class Pant
// Make 2 attribute, texture and color
// Make a class HalfPant that extends Pant
// Make 1 attribute color
// Make a Construtor of Pant that takes texture and color
// Make a Non-Param Constructor for Half pant, and call \
// Parent Parameterized Constructor, "Wool" and "Red"
// Make a function in HalfPant called changePant \
// Takes color as params, and set the current color of Pant to HalfPant \
// And change the  new color to HalfPant
class Pant{
    String texture;
    String color;
    Pant(String texture, String color){
        this.texture = texture;
        this.color = color;
    }
}
class HalfPant extends Pant{
    String color;
    HalfPant(){
        super("Wool", "Red");
    }
    void changePant(String color){
        super.color = this.color;
        this.color = color;
    }
}

/* 
1. Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car with method display() method to print details of the Car.

6. Let's examine the Java program given.
It involves multiple classes that depict different book types,
including Book, FictionBook, NonFictionBook, and TechnicalBook.
The Book class features a constructor and a method called displayDetails().
This method is responsible for outputting the title and author of a book.
The remaining classes inherit both the constructor 
and methods of the Book class as they extend it.
*/
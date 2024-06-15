public class Encapsulation{
    public static void main(String[] args){
        Laptop laptop1 = new Laptop();
        laptop1.setName("Apple M1");
        System.out.println(laptop1.getName());
    }
}
// bundle similar properties and function into class
class Laptop{
    // data hiding can be done using private access modifier
    private String name;
    private String brand;
    private double price;
    private int year;
    // make read-only access using getter
    public String getName(){
        return this.name;
    }
    // make write-only acces using setter
    public void setName(String name){
        this.name = name;
    }
    // Task make getter and setter for all attributes
    // Make 2 object of laptop
    // Output:
    // Name: Apple M1
    // Brand: Apple
    // Price: 100000
    // Year: 2023
}
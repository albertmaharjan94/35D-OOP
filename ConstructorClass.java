public class ConstructorClass{
    public static void main(String[] args){
        ConExample con1 = new ConExample();
        System.out.println("After object creation");
        ParameterizedConstructor pc1 = new ParameterizedConstructor(10);
        System.out.println("From object: " +pc1.length);
    }
}
// Task 
// Make a class FruitBasket
// make private attribute, appleCount, cheeryCount, grapeCount
// make Construtor and set all attribute
// make a function that returns total count of fruits
// make 2 objects
// print the total counts of all objects
class FruitBasket{
    private int appleCount;
    private int cheeryCount;
    private int grapeCount;
    FruitBasket(int appleCount, int cheeryCount, int grapeCount){
        this.appleCount = appleCount;
        this.cheeryCount = cheeryCount;
        this.grapeCount = grapeCount;
    }
    int countTotal(){
        return this.appleCount + this.cheeryCount + this.grapeCount;
    }
}

class ConExample{
    ConExample(){
        System.out.println("This is non parameterized constructor");
    }
}
class ParameterizedConstructor{
    int length;
    ParameterizedConstructor(int length){
        this.length = length;
        System.out.println(this.length);
    }
}
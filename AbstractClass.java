public class AbstractClass {
    public static void main(String[] args) {
        
    }
}
// to make abstract class, use abstract keyword before "class"
// if a class is abstract, it cannot be make object of
abstract class SmartPhone{
    // abstract function do not have a body
    // abstract class may or may not contain abstract function
    // if there is at least one abstract function, class have to be abstract
    abstract public void call();
    abstract public void message();
    abstract public boolean text(String text);
    public void delivery(){
        System.out.println("");
    }
}
// To use abstract class it has to be extended into sub/child class
class Samsung extends SmartPhone{
    // When abstract class is extended
    // all the abstract function must be overriden/ implemented
    @Override
    public void call(){
        System.out.println("Samsung calling");
    }
    @Override
    public void message(){
        System.out.println("Samsung message");
    }
    @Override
    public boolean text(String text){
        return true;
    }
}
// Task create a class Apple that extends Smartphone
// override the functions
// Make an Object of Samsung and Apple
// and call all the functions


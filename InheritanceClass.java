public class InheritanceClass{
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.lastname = "Test";
        cc.firstname = "ABC";
        cc.info();
        cc.greet();
        GrandChild gc = new GrandChild();
        gc.firstname = "John";
        gc.middlename = "Foo";
        gc.lastname = "Doe";
        gc.info();
        gc.call();
    }
}

class ParentClass{
    String lastname;
    private int salary;
    protected String address;
    void info(){
        System.out.println("Lastname" + lastname);
    }
}
// extends keyword used to create a child class
// single level, one parent has one child
class ChildClass extends ParentClass{
    String firstname;
    void greet(){
        System.out.println("Firstname: " + firstname + "Lastname: " + lastname);
    }
}
// multi level
class GrandChild extends ChildClass{
    String middlename;
    void call(){
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}
// Tree
class UncleClass extends ParentClass{
    String job;
    void detail(){
        System.out.println(job + " " + lastname);
    }
}









class Animal{
    int lifespan;
    void speaks(){
        System.out.println("Animal speaks");
    }
}
class Mammal extends Animal{
    int legs;
    void fur(){
        System.out.println(legs + " Furry");
    }
}
class Reptile extends Animal{
    int eggs;
    void shed(){
        System.out.println("Shedding");
    }
}
class Dog extends Mammal{
    String diet;
    void barks(){
        System.out.println("Dog barks");
    }
}
class GermanShepard extends Dog{

}
class Labrador extends Dog{
    
}
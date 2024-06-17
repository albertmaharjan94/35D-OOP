public class FirstOop{
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Ram";
        person1.age = 10;
        person1.gender = 'M';

        System.out.println(person1.name);
        person1.introduction();

        // Task create two object of Person and call introduction function
        Person person2 = new Person();
        person2.name = "XYZ";
        person2.age = 12;
        person2.gender = 'F';
        person2.introduction();

        Rectangle rec1 = new Rectangle();
        rec1.lenght = 10;
        rec1.breadth = 90;
        int areaRec1 = rec1.areaOfRectange();
        System.out.println("Area of rec1 is " + areaRec1);
    }
}
// Create a class Car
// attribute
// - name
// - color
// - year
// functions
// - start() => print Car name is starting
// - stop() => print Car name of color is stopping
// - expiry() => return 100 added to year
// Create 3 object of car
// start all object/cars
// stop only 1st object/car
// print the expiry of last 2 object/car

// Task 2
// Create a class Student
// attribute
// - firstName
// - lastName
// - studentId
// - age
// functions
// - fullName() => return firstName + lastName
// - description() => print fullName and studentId
// - overEighteen() => return boolean of weather student is over 18
// Make Object of your detail
// print your fullname
// call description
// print if you are overEighteen or not
class Student{
    String firstName;
    String lastName;
    int studentId;
    int age;
    String fullName(){
        return firstName + " " + lastName;
    }
    void description(){
        System.out.println(fullName() + " " + studentId);
    }
    boolean overEighteen(){
        return age > 18;
    }
}


class Rectangle{
    int lenght;
    int breadth;

    int areaOfRectange(){
        int area = lenght * breadth;
        return area;
    }
}

class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("Name : " +name + " Age " + age);
    }
}
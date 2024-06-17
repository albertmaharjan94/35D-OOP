public class SecondOop{
    public static void main(String[] args){
        NewPerson p = new NewPerson();
        p.name = "Ram";
        p.age = 10;

        p.personInfo();

        NewPerson p2 = new NewPerson();
        p2.name = "Shyam";
        p2.age = 12;
        p2.personInfo();
        // p2.phNumber = "9090"; // You cannot do this
        p2.setPhNumber();
        p2.setThisNumber("900000");
        String getHere = p2.getPhNumber();
        System.out.println(getHere);

    }
}

class NewPerson{
    String name;
    int age;
    // access modifier, it is "default" if not specified
    private String phNumber;
    public int salary;

    void personInfo(){
        System.out.println(name);
    }
    void setPhNumber(){
        this.phNumber = "9090";
    }
    void setNewPhNumber(String num){
        this.phNumber = num;
    }
    String getPhNumber(){
        return phNumber;
    }
    void setThisNumber(String phNumber){
        this.phNumber = phNumber;
    }
}

// Task 
// create a class Football
// make two attribute
// String homeTeam and awayTeam
// make another attribute time
// make private attritube goal 
// make a setter for goal
// make a getter for goal
// make private attribute winner as String
// make only setter for winner
// make function detail() -> print winner name, time and total goal
// make Object of football and fill all the attribute
class Football{
    String homeTeam;
    String awayTeam;
    int time;
    private int goal;
    private String winner;
    void setGoal(int goal){
        this.goal = goal;
    }
    int getGoal(){
        return this.goal;
    }
    void setWinner(String winner){
        this.winner = winner;
    }
    void detail(){
        System.out.println("Winner:" + winner + " Time:"+ time + " Goals:" + goal);
    }
}
// Object
// Football f1 = new Football();
// f1.homeTeam = "England";
// f1.awayTeam = "Spain";
// f1.time = 90;
// f1.setGoal(3);
// f1.setWinner("England");
// f1.detail();
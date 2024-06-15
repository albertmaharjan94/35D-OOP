public class Dum{
    public static void main(String[] args){
        T2 t = new T2();
        t.displayParent();
    }
}
class T0{

    String name = "T0 Name";
}
class T1 extends T0{
    String name = "T1 Name";
}
class T2 extends T1{
    String name = "T2";
    void displayParent(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
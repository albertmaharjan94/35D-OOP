import java.util.Scanner;
public class DoWhileLoop{
    public static void main(String[] args){
        int num1 = 0;
        while(num1 < 0){
            System.out.println("While checks condition first");
        }

        /* Do while checks condition after first iteration */
        do{
            System.out.println("Do while checks condition after");
        }while(num1 < 0);
        /* This means do while loop runs at least once */
        
        /* Task
        * Use a while loop to
        * ask user for an int value
        * if the user input positive value
        * promt user to input negative value
        * loop until the user input negative int value
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scan.nextInt();
        while(input >=0 ){
                System.out.println("Please enter negative number");
                input = scan.nextInt();
        }
        System.out.println("The negative value is " + input);
        scan.close();
    }
}
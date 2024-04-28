public class ForLoop{
    public static void main(String[] args){
        /* Use for loop when condition is fixed */
        for(int index = 0; index < 5; index ++){
            System.out.println("Loop running " +index);
        }

        /* Decrement loop */
        for(int index = 10; index >=0 ; index --){
            System.out.println("Loop running "  +index);
        }
        /* Make the loop table for this */

        /* Task 
        * Make a multiplication table of 2
        * print like the following
        * 2 x 1 = 2
        * 2 x 2 = 4
        * .
        * .
        * 2 x 10 = 20
        * Note: initialize 1
        * condition <=10 or < 11
        * Increament ++
        * /
        for(int index = 1; index <=10 ; index ++){
            System.out.println("2 x " + index + "=" + index * 2);
        }

        /* Nested loop */
        for(int outer = 0; outer < 3; outer ++){
            for(int inner = 2; inner >= 0; inner --){
                System.out.println("Inner " + inner);
            }
            System.out.println("Outer " + outer);
        }
        /* Task use nested loop to do the following
        * Make multiplication table from 1 - 10
        * eg:
        * Multiplication of 1
        * 1 x 1 = 1
        * 1 x 2 = 2
        * .
        * 1 x 10 = 10
        * .
        * .
        * Multuplication of 10
        * 10 x 1 = 10
        * 10 x 2 = 20
        * .
        * 10 x 10 = 100
        */
        for(int outer = 1; outer <=10; outer ++){
            System.out.println("Multiplication " + outer);
            for(int inner = 1; inner <=10; inner ++){
                System.out.print(inner);
                System.out.print(" X ");
                System.out.print(outer);
                System.out.print(" = ");
                System.out.println(inner * outer);
            }
        }
    }
}
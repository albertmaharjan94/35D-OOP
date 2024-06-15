public class ArrayLoop{
    public static void main(String[] args){
        int[] array1 = {20, 40, 60, 80, 100, 120};
        int array1Length = array1.length;
        /* Either loop from 0 and index < array1Length
        * or loop from 0 and index <= array1Length - 1 */
        for(int index = 0; index < array1Length; index ++ ){
            System.out.println("Value in index " + index + " " + array1[index]);
        }
        /* Descending loop */
        /* Start loop from array1Length - 1 to 0, decrement */
        for(int index = array1Length -1; index >=0; index --){
            System.out.println("Descending " + array1[index]);
        }
        int counter = 0;
        /* Use this counter to iterate array1 in while loop */
        while(counter < array1Length){
            System.out.println(array1[counter]);
            counter ++ ;
        }
        /* Make two array of length 5
        * myArray1 and myArray2
        * fill the data in myArray1 as 50, 40, 30, 20, 10
        * loop the myArray1 put the value in myArray2 in reverse
        * myArray2 should be 10, 20, 30, 40, 50
        * print myArray2 in ascending order
        * Hint: make a counter for array2 when putting data
        */
        int[] myArray1 = { 50, 40, 30, 20, 10 };
        int[] myArray2 = new int[5];
        int myArray2Index = 0;
        int myArray1Length = myArray1.length;
        for(int index = myArray1Length - 1; index >=0; index --){
            myArray2[myArray2Index] = myArray1[index];
            myArray2Index ++;
        }

        for(int index = 0; index < myArray2.length ; index ++){
            System.out.println("My Array 2 " + myArray2[index]);
        }

    }
}
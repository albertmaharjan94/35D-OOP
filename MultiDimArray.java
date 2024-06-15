public class  MultiDimArray{
    public static void main(String[] args){
        /* Create N-dimension array add number of square bracked */
        /* 1D Array */
        int[] oneDArray;
        /* 2D Array */
        int[][] twoDArray;
        /* 3D Array */
        int[][][] threeDArray;

        /* Allocating memory/size */
        twoDArray = new int[3][5];
        /* First size 3 represent how many inner array */
        /* Second size 5 represet how many value in inner array */
        /* [
        *    [0,0,0,0,0], -> 0
        *    [0,0,0,0,0], -> 1
        *    [0,0,0,0,0]  -> 2
        *   ] 
        */

       /* To take the first inner array use index */
    //    twoDArray[0];
       /* To take the value in first inner array use internal index */
       twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[1][2] = 100;
        twoDArray[2][4] = 200;
        /* Fill the array like the following 
        * [
        *    [10,20,30,40,50], -> 0
        *    [80,90,100,110,120], -> 1
        *    [150,160,170,180,200]  -> 2
        *   ] 
        */
       
       /* Now print the 1th index array like 
       * Array in 1th index 
       * 80
       * 90
       * 100
       * 110
       * 120
       * Note: Without using loop
       */

        /* Multi Dim array memory alloc and assignment */
        int[][] arrayTwo = {
          {10, 20, 30},
          {20, 30, 40},
          {100, 200, 300},
          {3, 4, 5}  
        };
        // [4][3]

        



    }
}
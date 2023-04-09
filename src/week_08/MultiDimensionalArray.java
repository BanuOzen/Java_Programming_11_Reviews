package week_08;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        // two dimension
        int[][] array2D = {
//               0  1  2
                {1, 2, 3}, // 0 //row
                {4, 5, 6}, // 1
          //     0  1  2   3
                {7, 8, 9, 10} // 2

        };

        // print array
        System.out.println(Arrays.deepToString(array2D));

        // print 5
        System.out.println(array2D[1][1]);
        System.out.println(array2D[2][3]);

        // three dimension
        int[][][] array3D = {
                {
                        {1,2,3},
                        {4,5,6}// one dimensional array

                },//first two dimensional array
                {

                }//second two dimensional array


        };  // three dimensional array

        int[][] array = {
//               0  1  2
                {1, 2, 3}, // 0 //row
                {4, 5, 6}, // 1
                //     0  1  2   3
                {7, 8, 9, 10} // 2

        };
        // loop with 2 dimensional array

        for (int i = 0; i < array.length; i++) { //rows or we can say each one dimensional arrays
            System.out.println("started with " + (i+1) + " array");
            for (int j = 0; j < array[i].length ; j++) { // for the elements or columns
                System.out.println(array[i][j]);
            }
            System.out.println("finished " + (i+1) + " array");
        }



    }
}

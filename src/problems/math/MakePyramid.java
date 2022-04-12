package problems.math;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

    public static void main(String[] args) {
        //write your code here
        int n = 6;
        for(int i = 1; i<= n; i++){
            for(int j = i; j<= n; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

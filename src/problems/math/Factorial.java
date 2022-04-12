package problems.math;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */
    // Factorial is a function that multiplies a given number by every number below it.
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
         for(int i= 1; i<= n; i++){
             number = number * i;
         }
        System.out.println(number);
    }
}


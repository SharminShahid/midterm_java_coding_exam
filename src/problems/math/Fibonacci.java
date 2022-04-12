package problems.math;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */
    // Fibonacci number is the sum of two preceding numbers.
    public static void main(String[] args) {

        //run your code here
        int n1= 1;
        int n2= 2;
        int sum=0;

        System.out.print(n1+" "+n2); //0 1
         for (int i= 2; i<30; i++){
             sum = n1 + n2;
             System.out.print("  "+sum);
             n1 = n2;
             n2 = sum;
         }


    }
}

package problems.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {

        //write your code here
        List<Integer> primeNumbers = new ArrayList<>();

        for(int numToCheck=2; numToCheck< 100000; numToCheck++){
            boolean isPrime = true;

            for(int i = 2; i<= numToCheck/2; i++){
                if(numToCheck % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(numToCheck);
            }
        }
        System.out.println("prime numbers are: ");
        for(int number : primeNumbers){
            System.out.println(number);
        }

    }
}

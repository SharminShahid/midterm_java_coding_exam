package problems.math;

public class FindMissingNumber {

    /*
     *
     * the below array is supposed to have a range of number from 1 to 10
     * {10, 2, 1, 4, 5, 3, 7, 8, 6}
     * one number is missing (9 in this case)
     * write java code to find the missing number from the array
     * use a static helper method to find it
     *
     */


    public static void main(String[] args) {

        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        //sum1 10+2+1+4+5+3+7+8+6 =  46
        //sum2 10+9+8+7+6+5+4+3+2+1= 55
        //missing number = sum2 - sum1 = 9

        int sum1=0;
        for(int i=0; i<array.length; i++){
            sum1=sum1+array[i];

        }
        System.out.println("sum of elements in the array:"+  sum1);

        int sum2=0;
        for(int i=1; i<=10; i++){
            sum2=sum2+i;
        }
        System.out.println("sum of range:"+ sum2);
        System.out.println("missing number is:"+ (sum2 - sum1));



    }
}

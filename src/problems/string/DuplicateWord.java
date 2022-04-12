package problems.string;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void main(String[] args) {

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";

        //run your code here
        int count;
        String array[]= str.split(" ");
        System.out.println("Duplicate word is :  ");

        for(int i=0; i< array.length; i++){
            count = 1;
            for(int j=i+1; j< array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                    array[j]="0";
                }
            }
            if(count>1 && array[i] != "0") {
                System.out.println(array[i]);
            }
        }



    }

}

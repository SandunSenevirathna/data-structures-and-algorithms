import java.util.Arrays;
import Sample.MyClass;

public class Main {

    public static void log(int [] numbers) {
        //Big O(2)
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
    }

    public static void logLoop(int [] numbers) {
        //Big O(n)
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void logMore(int [] numbers) {
        //Big O(1 + n + 1) = (2+ n)

        System.out.println(Arrays.toString(numbers)); //  Big O(1)

        for (int number : numbers) {  // Big O(n)
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers)); // Big O(1)

    }

    public static void logMoreThanMore(int [] numbers) {
        //Big O(n ^ n ^ ) = (n ^ 3)

        for (int firstNumber : numbers) {  // Big O(n)
            for(int secondNUmber : numbers){ // Big O(n)
                for (int thirdNumber : numbers){ // Big O(n)
                    System.out.println(firstNumber + " " + secondNUmber + " " + thirdNumber);
                }
            }
        }

        System.out.println(Arrays.toString(numbers)); // Big O(1)

    }

    public static void main(String[] args) {
        System.out.println("Big O");

        // Define an array of integers
        int[] myNumbers = {1, 2, 3, 4, 5};


        //log(myNumbers);   // Big O(2)
        //logLoop(myNumbers);  // Big O(n)

       // logMore(myNumbers);

        logMoreThanMore(myNumbers);


    }
}

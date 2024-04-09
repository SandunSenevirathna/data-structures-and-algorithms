package BigO;

import java.util.Arrays;

public class BigO {

    public static void log(int [] numbers) {

        //Big O(2)
        System.out.println("------- Big O(2) ---------");
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
    }

    public static void logLoop(int [] numbers) {
        //Big O(n)
        System.out.println("------- Big O(n) ---------");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void logMore(int [] numbers) {
        //Big O(1 + n + 1) = (2+ n)

        System.out.println("------- Big O(2 + n) ---------");

        System.out.println(Arrays.toString(numbers)); //  Big O(1)

        for (int number : numbers) {  // Big O(n)
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers)); // Big O(1)

    }

    public static void logMoreThanMore(int [] numbers) {
        //Big O(n ^ n ^ ) = (n ^ 3)
        System.out.println("------- Big O(n ^ 3) ---------");

        for (int firstNumber : numbers) {  // Big O(n)
            for(int secondNUmber : numbers){ // Big O(n)
                for (int thirdNumber : numbers){ // Big O(n)
                    System.out.println(firstNumber + " " + secondNUmber + " " + thirdNumber);
                }
            }
        }

        System.out.println(Arrays.toString(numbers)); // Big O(1)

    }
}

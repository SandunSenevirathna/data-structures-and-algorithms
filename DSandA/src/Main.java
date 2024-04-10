import BigO.BigO;
import Arrays.Arrays;
import  Arrays.Array;
public class Main {



    public static void main(String[] args) {
        //int[] myNumbers = {1, 2, 3, 4, 5};

        //BigO.log(myNumbers);
        //BigO.logLoop(myNumbers);
        //BigO.logMore(myNumbers);
        //BigO.logMoreThanMore(myNumbers);

        // Create an array object with a size of 3
        Array number = new Array(5);

        // Insert elements into the array
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        number.insert(50);

        number.print(); // Output: Array elements: 10 20 30 40 50

        // Remove an element from the array
        number.remove(2);

        // Print the elements of the array after removal
        number.print(); // Output: Array elements: 10 20 40 50




    }
}

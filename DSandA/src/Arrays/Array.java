package Arrays;

// This class represents an array of integers.
public class Array {
    private int[] items; // This array stores the elements of the array.
    private int count;   // This variable keeps track of the number of elements currently in the array.
    private int size;    // This variable represents the maximum number of elements the array can hold.

    // Constructor: Initializes the array with a given size.
    public Array(int size) {
        // Create an array with the specified size.
        this.items = new int[size];
        // Initially, there are no elements in the array.
        this.count = 0;
        // Set the maximum capacity of the array.
        this.size = size;
    }

    // Method to insert an element into the array.
    public void insert(int element) {
        // Check if the array is full.
        if (count == size) {
            // If the array is full, print a message and return.
            System.out.println("Array is full. Cannot insert element.");
            return;
        }

        // Insert the element at the end of the array.
        items[count] = element;
        // Increment the count to reflect the addition of the element.
        count++;
    }

    // Method to remove an element from the array by index.
    public void remove(int index) {
        // Check if the index is valid.
        if (index < 0 || index >= count) {
            // If the index is invalid, print a message and return.
            System.out.println("Invalid index. Cannot remove element.");
            return;
        }

        // Shift elements to the left to fill the gap created by removing the element.
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        // Decrement the count to reflect the removal of the element.
        count--;
    }

    // Method to print the elements of the array.
    public void print() {
        // Print the label for array elements.
        System.out.print("Array elements: ");
        // Print each element of the array.
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        // Move to the next line after printing all elements.
        System.out.println();
    }
}

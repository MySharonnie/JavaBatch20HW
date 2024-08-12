package e77;

public class E77Arrays {
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] numbers = {5, 4, 8};
        int highestValue = numbers[0];
        // Use a loop to iterate through the array and find the highest value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
            }
        }
        // Print the highest value found in the array
        System.out.println(highestValue);
    }
}

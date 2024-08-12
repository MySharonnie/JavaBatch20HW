package e85;

public class E85NestedForLoops {
    public static void main(String[] args) {
        int max = 7; // Maximum number of lines in the upper part of the pattern

        // Outer loop controls the number of lines in the upper part of the pattern
        for (int i = 1; i <= max; i++) {
            // Inner loop to print numbers in each line
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Outer loop controls the number of lines in the lower part of the pattern
        for (int i = max - 1; i >= 1; i--) {
            // Inner loop to print numbers in each line
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}


package e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];
        int rows = 5;
        int col = 10;
        // Use nested loops to fill the 2D array with multiplication table values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                table[i][j] = (i + 3) * (j + 1);
            }
        }
        // Use nested loops to iterate through the 2D array and print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}

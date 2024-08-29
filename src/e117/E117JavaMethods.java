package e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        E117JavaMethods m = new E117JavaMethods();
        int sum1 = m.sumEvenToX(9);
        System.out.println(sum1);
    }

    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum

    int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }return sum;


    }
}
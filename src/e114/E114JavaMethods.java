package e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        E114JavaMethods m=new E114JavaMethods();

        // Call the add method with arguments that add up to 30
        m.add(20, 10);

        // Call the multiply method with arguments that multiply to 30
        m.multiply(15, 2);

        // Call the subtract method with arguments that subtract to 20
        m.subtract(30, 10);

    }

    // Create method multiply with two integer parameters and a print statement to display the result

    int multiply(int a, int b) {
        int r = a * b;
        System.out.println("Multiplication: "+r);
        return r;
    }

    // Create method add with two integer parameters and a print statement to display the result

    int add(int a, int b) {
        int r2 = a + b;
        System.out.println("Addition: "+r2);
        return r2;


    } // Create method subtract with two integer parameters and a print statement to display the result

    int subtract(int a, int b) {
        int r3 = a - b;
        System.out.println("Subtraction: "+r3);
        return r3;
    }
}

package e112;

public class E112JavaMethods {
    public static void main(String[] args) {
        // Call method printNumbers
        E112JavaMethods j = new E112JavaMethods();
        j.printNumbers();
    }

    // Create method printNumbers that prints numbers from 1 to 10

    void printNumbers() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        return;
    }

}

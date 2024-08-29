package e132;

public class E132StaticKeyword {

    static int reduce10(int[][] numbers) {
        for (int[] num : numbers) {
            for (int n : num) {
                n = n - 10;
                System.out.print(n + " ");
            }
            System.out.println();


        }
        int n = 0;
        return n;
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {15, 8, 85, 61},
                {99, 41, 16, 5}
        };
        E132StaticKeyword.reduce10(numbers);
    }
}


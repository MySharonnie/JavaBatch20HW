package e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner x=new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("In:");

        // Read the input string

        String y=x.nextLine();

        StringBuilder z=new StringBuilder(y);

        StringBuilder r = z.reverse();
        String abc=r.toString();

        // Use a for loop to reverse the string
        for (int i = 0; i < y.length(); i++) {


            System.out.print(abc.charAt(i));


        }
        System.out.println();


        // Print the reversed string

    }
}

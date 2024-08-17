package e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner abc=new Scanner(System.in);


        // Prompt the user to input a string
        System.out.println("Please input a string");

        String entry=abc.nextLine();


        // Use a for loop to iterate through the string and print each character on a separate line

        for (int i = 0; i < entry.length(); i++) {
            System.out.println(entry.charAt(i));

        }

    }
}

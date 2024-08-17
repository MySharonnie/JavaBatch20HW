package e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner x = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string

        String entry=x.nextLine();

        StringBuilder next=new StringBuilder(entry);

        StringBuilder rev=next.reverse();

        String entry2=rev.toString();


        if (entry.equals(entry2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise
    }
}

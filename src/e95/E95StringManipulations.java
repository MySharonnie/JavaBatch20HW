package e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner str=new Scanner(System.in);

        // Prompt the user to input a string value
        System.out.println("Please enter a string:");

        // Read the input string

        String x=str.nextLine();


        // Extract the first 3 letters using the substring() method

        String y=x.substring(0,3);

        // Print the result in the specified format

        System.out.println("The first 3 letters of "+x+" is "+y);
    }
}

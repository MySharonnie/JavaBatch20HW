package e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here




        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter a name");
            String name=input.nextLine();
            arr[i]=name;


        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0,3));

        }

    }
}



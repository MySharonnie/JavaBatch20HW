package e106;

import java.util.Locale;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate an object of the StringBuffer class

        StringBuffer sb=new StringBuffer("");

        // Append the value "Hello" to the StringBuffer
        sb.append("Hello"+" ");

        // Append the value "World" to the StringBuffer
        sb.append("World");

        // Convert the StringBuffer content to uppercase and print it

        String s=sb.toString();
        System.out.println(s.toUpperCase());

    }
}

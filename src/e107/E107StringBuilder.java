package e107;

public class E107StringBuilder {
    public static void main(String[] args) {
        // Given string
        String given = "Hello Friends";

        // Instantiate an object of the StringBuffer class with the given string
        StringBuffer x=new StringBuffer(given);

        // Use the reverse() method to reverse the string

        x.reverse();
        String y=x.toString();

        // Print the reversed string

        System.out.println(y);

    }
}

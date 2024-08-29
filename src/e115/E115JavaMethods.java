package e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result

        E115JavaMethods j= new E115JavaMethods();
        String newWord =j.convertToUpper("baby");
        System.out.println(newWord);


    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string



    String convertToUpper(String word){
        return word.toUpperCase();


    }
}

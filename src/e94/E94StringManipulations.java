package e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "I love Java classes at Syntax" to it
        String given = "I love Java classes at Syntax";

        // Use the substring() method to retrieve the substring "classes at Syntax" and print it

        int num=given.indexOf("classes");

        System.out.println(given.substring(num));
        System.out.println(given.substring(0,num));


        // Use the substring() method to retrieve the substring "I love Java" and print it
    }
}

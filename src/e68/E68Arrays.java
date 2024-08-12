package e68;

public class E68Arrays {
    public static void main(String[] args) {
        // Create an array of characters and store the values 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'
        char[] syntax = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

        for (int i = 0; i < syntax.length; i++) {
            if (i % 2 == 0)
                System.out.print(syntax[i]);

            // Print the characters at the indices that form the word "syntax"


        }
    }
}

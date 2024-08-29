package e140;

public class E140AccessModifiers {

    String maxLength(String[] words) {
        String longest = words[0];

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println(longest);

        return longest;
    }

    public static void main(String[] args) {
        E140AccessModifiers e = new E140AccessModifiers();

        String[] words = {"Elizabeth", "Stephen", "Angelina", "Bartholomew"};
        e.maxLength(words);

    }
}




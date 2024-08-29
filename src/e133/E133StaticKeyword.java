package e133;

public class E133StaticKeyword {

    static int counter = 0;

    static int countA(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                counter++;
            }
        }System.out.println(counter);

        return counter;


    }

    public static void main(String[] args) {

        E133StaticKeyword.countA("assassination");



    }
}


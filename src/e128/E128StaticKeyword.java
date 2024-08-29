package e128;

public class E128StaticKeyword {

    static String mixString(String s1, String s2) {
        int n=s1.length() + s2.length();
        for (int i = 0; i < n; i++) {
            char c=s1.charAt(i);
            char c1=s2.charAt(i);
            System.out.print(c+c1);
            continue;


        }
        return s1;
    }

    public static void main(String[] args) {



    }


}


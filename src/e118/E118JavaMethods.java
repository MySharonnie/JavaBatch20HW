package e118;

public class E118JavaMethods {

    public static void main(String[] args) {
        // Students will write the code here.
        E118JavaMethods m=new E118JavaMethods();
        m.word("mississippi");
    }


    String word(String spaceOut){
        for (int i = 0; i < spaceOut.length() ; i++) {
            System.out.print(spaceOut.charAt(i)+" ");

        } return spaceOut;
    }
}

package e131;

public class E131StaticKeyword {

    String thirdLetter(String s){
        for (int i = 0; i <s.length() ; i+=3) {
            System.out.print(s.charAt(i));

        } return s;
    }
    public static void main(String[] args) {

        E131StaticKeyword e=new E131StaticKeyword();
        e.thirdLetter("abcdefghijklmnopqrstuvwxyz");
    }
}

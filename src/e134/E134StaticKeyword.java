package e134;

public class E134StaticKeyword {

    static int counter=0;

    static int countVowels(String s){
        String x=s.toLowerCase();

        for (int i = 0; i <s.length() ; i++) {
            if(x.charAt(i)== 'a'|| x.charAt(i)=='e'|| x.charAt(i)=='i'|| x.charAt(i)=='o' || x.charAt(i)=='u'){
                counter++;
            }


        } System.out.print(counter);
        return counter;
    }


    public static void main(String[] args) {
        E134StaticKeyword.countVowels("Sandoval");

    }
}


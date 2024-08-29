package e139;

public class E139AccessModifiers {

    public String alphabetical(String str) {
        int i=0;
        while (i<str.length()-1){
            if (str.charAt(i)<str.charAt(i+1)){
                System.out.print(str.charAt(i));
            } i++;

        }  return str;
    }

    public static void main(String[] args) {
        E139AccessModifiers e=new E139AccessModifiers();
        e.alphabetical("Strange");

    }


}


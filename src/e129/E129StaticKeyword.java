package e129;

public class E129StaticKeyword {

    static String country;
    static String continent;

    static String printInfo(String country, String continent){
        System.out.println(country+" "+"is located on the continent of "+continent);
        return country;

    }
    public static void main(String[] args) {
        E129StaticKeyword.printInfo("USA","North America");


    }
}

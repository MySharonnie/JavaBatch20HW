package e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch numberi

    int year;
    String schoolName;
    int batchNo;


    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
        E120Variables x=new E120Variables();
        x.year=2024;
        x.schoolName="Syntax";
        x.batchNo=20;

        System.out.println("I am a student of batch "+x.batchNo+" studying at "+x.schoolName+" in the year "+x.year);

    }
}

package e113;

public class E113JavaMethods {
    public static void main(String[] args) {
        // Call method printTime with arguments 11 and 30
        E113JavaMethods m= new E113JavaMethods();
        m.printTime(12, 30);

    }

    // Create method printTime with two integer parameters (hours and minutes)
    // and a print statement to display the time

    void printTime(int hours, int minutes){
        System.out.println(hours+":"+minutes);
    }

}

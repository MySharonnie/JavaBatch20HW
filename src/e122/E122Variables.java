package e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize

    String countryName;
    String capital;
    int populationSize;

    void printInfo(){
        System.out.println("The capital of "+countryName+" is "+capital+" and the population is "+populationSize);
    }

    // Create a method to display values of instance variables

    public static void main(String[] args) {
        // Create 2 instances of the class
        E122Variables e=new E122Variables();
        E122Variables e1=new E122Variables();

        // Assign values to variables for the first instance

        e.countryName="USA";
        e.capital="Washington DC";
        e.populationSize=330000000;

        // Execute the method to display values for the first instance

        e.printInfo();

        // Assign values to variables for the second instance

        e1.countryName="Colombia";
        e1.capital="Bogota";
        e1.populationSize=30000000;

        // Execute the method to display values for the second instance

        e1.printInfo();
    }
}

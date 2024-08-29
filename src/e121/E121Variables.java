package e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char

    int x;
    double y;
    char c;

    public static void main(String[] args) {
        // Create 2 instances of the class
        E121Variables a=new E121Variables();
        E121Variables a2=new E121Variables();




        // Assign values to variables for the first instance
        a.x=20;
        a.y=110.5;
        a.c='z';



        // Print values of the first instance
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.c);



        // Assign values to variables for the second instance
        a2.x=51;
        a2.y=11.1;
        a2.c='e';


        // Print values of the second instance

        System.out.println(a2.x);
        System.out.println(a2.y);
        System.out.println(a2.c);
    }
}

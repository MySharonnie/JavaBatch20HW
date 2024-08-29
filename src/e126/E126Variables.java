package e126;

public class E126Variables {
    // Declare a static variable at the class level to hold the count of all instances of the class
     static int instanceCount = 0;


    // Constructor to increment the count

    public E126Variables() {
        instanceCount++;

    }
    public static void main(String[] args) {
        E126Variables e1= new E126Variables();
        E126Variables e2=new E126Variables();
        E126Variables e3=new E126Variables();

        System.out.println(instanceCount);



    }

}




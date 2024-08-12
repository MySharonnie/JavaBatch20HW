package e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        Dog d=new Dog();

        // Declare String variables named 'breed', 'name', and 'color'

        d.breed="Husky";
        d.name="Sparky";
        d.color="gray";

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        d.bark();
        d.run();
        d.play();

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"

        Dog d2=new Dog();

        d2.breed="Bulldog";
        d2.name="Brutus";
        d2.color="Brown";

        d2.bark();
        d2.run();
        d2.play();

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"

        Dog d3=new Dog();

        d3.breed="Labrador";
        d3.name="Lassie";
        d3.color="Yellow";

        d3.bark();
        d3.run();
        d3.play();


        // Call the methods 'bark()', 'run()', and 'play()' for each object










    }
}

package e137;

public class E137AccessModifiers {

    public String name;
    String city;
    protected String school;
    private int batch_no;

    void printInfo() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + school + " in Batch " + batch_no+".");


    } public E137AccessModifiers(int batchNo){
        batch_no = batchNo;
    }


    public static void main(String[] args) {

        E137AccessModifiers e = new E137AccessModifiers(20);
        e.name="Sharonne";
        e.city="Blackwood";
        e.school="Syntax";
        e.printInfo();
    }
}


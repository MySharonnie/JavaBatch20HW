package e136;

public class E136AccessModifiers {

private void pri(){
    System.out.println("This is the private method");
}

void def(){
    System.out.println("This is the default method");
}

protected void pro(){
    System.out.println("This is the protected method");
}

public void pub(){
    System.out.println("This is the public method");
}

    public static void main(String[] args) {
E136AccessModifiers e=new E136AccessModifiers();
e.pri();
    }
}

class E136Protected extends E136AccessModifiers{
    public static void main(String[] args) {
        E136AccessModifiers e=new E136AccessModifiers();
        e.pro();
    }
}







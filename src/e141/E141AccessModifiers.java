package e141;

public class E141AccessModifiers {

    int maxValue(int[] max) {
        int biggest = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i]>biggest) {
                biggest = max[i];
            }

        }
        System.out.println(biggest);
        return biggest;
    }

    public static void main(String[] args) {
        E141AccessModifiers e = new E141AccessModifiers();

        int[] max = {25, 155, 10, 3, 19};
        e.maxValue(max);


    }
}

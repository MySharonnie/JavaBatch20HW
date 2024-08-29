package e130;

import e128.E128StaticKeyword;

public class E130StaticKeyword {

    int mysteryArray(int[] a) {
        int r =0;
        for (int n : a) {
            if (n % 2 == 0) {
                r=n/2;
            } else {
                r=n*10;
            }
            System.out.print(r + " ");
        }

        return r;
    }


    public static void main(String[] args) {
        E130StaticKeyword e = new E130StaticKeyword();
        int[] a = {15, 20, 35, 40};
        e.mysteryArray(a);


    }
}

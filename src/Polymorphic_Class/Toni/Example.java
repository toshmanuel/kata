package Polymorphic_Class.Toni;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b;
        b = a;
        a[2] = 8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}

package GlebTests.OOP;

import org.junit.Test;

public class Math {
    public static void main(String[] args) {

    }

    @Test
    public void math() {
    float [] arr = new float [] {0.01f, 11.11f, 22.22f, 33.33f, 44.44f};
    for (int i = 0; i < 5; i++) {
        System.out.println("Element " + i + " is " + arr[i]);
        }
    }

    @Test
    public void func() {
        int a = 26;
        int b = 74;
        int res = a + b;
        int res2 = res / res;
        System.out.println("Result is: " + res2);
    }
}
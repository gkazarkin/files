import org.junit.Test;

public class MathTest {

        @Test
        public void mathTest () {
            float[] arr = new float[]{0.01f, 11.11f, 22.22f, 33.33f, 44.44f};
            for (int i = 0; i < 5; i++) {
                System.out.println("Element " + i + " is " + arr[i]);
            }
        }

        @Test
        public void funcTest () {
            int a = 26;
            int b = 74;
            int res = a + b;
            int res2 = res / res;
            System.out.println("Result is: " + res2);
        }
}
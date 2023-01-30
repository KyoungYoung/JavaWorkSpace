package Basic1;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("kky");
        printSum(10,20);
        System.out.println(multiply(10,20));

        int[] sumAndProduct = addAndMultiply(100, 200);
        System.out.println(Arrays.toString(sumAndProduct));
        System.out.println(sumAndProduct[0]);

    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello" + name);
    }
    public static void sayHello(){
        System.out.println("Hello!!");
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a*b;
        int[] result = {sum, product};
        return result;
    }
}

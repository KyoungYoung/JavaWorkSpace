package Basic2;

import java.util.Arrays;

public class Arr01 {
    public static void main(String[] args) {
        String[] arr = new String[]{"1","2","3"};
        String[] arr2 = {"4", "5"};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr2);
        Test t = new Test();
        System.out.println(t.plus(1, 2));
        System.out.println(t.plus(1.2, 2.3));
    }


}

class Test {
    static int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    static double plus(double x, double y) {
        double result = x + y;
        return  result;
    }
}
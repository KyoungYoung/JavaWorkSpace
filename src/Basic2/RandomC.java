package Basic2;

import java.util.Arrays;
import java.util.Random;

public class RandomC {
    public static void main(String[] args) {
        DieA d1 = new DieA();
        DieB d2 = new DieB();


        int[] myArr = new int[13];
        for (int i = 0; i < myArr.length; i++) {
            int a = d1.roll();
            int b = d2.roll();
            myArr[i] += a + b;
        }

        System.out.println(Arrays.toString(myArr));
    }
}

class DieA {
    public static int roll() {
        double r = Math.random() * 6;
        int randInt = (int) r + 1;
        return randInt;
    }
}

class DieB{
    public static int roll(){
        double r = Math.random() * 6;
        int randInt = (int) r + 1;
        return randInt;
    }
}

package Basic2;

import java.util.ArrayList;
import java.util.Random;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            s.add(r.nextInt(256));
        }
        System.out.println(s);
    }
}

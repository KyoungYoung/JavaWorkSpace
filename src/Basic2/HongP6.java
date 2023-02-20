package Basic2;

import javax.swing.*;
import java.util.Arrays;

public class HongP6 {
    public static void main(String[] args) {
        Football f = new Football();
        Baseball b = new Baseball();
        Basketball c = new Basketball();
        f.name = "축구";
        b.name = "야구";
        c.name = "농구";

        Sports[] arr2 = {f, b, c};

        Sports[] arr1 = new Sports[]{f, b, c};
        for (int i = 0; i < arr1.length; i++) {
            Sports result = arr1[i];
            result.description();

        }
    }
}

class Sports{
    String name;

    public void description() {
        System.out.println(name);
    }

}

class Football extends Sports {

}

class Baseball extends Sports{

}

class Basketball extends Sports{

}

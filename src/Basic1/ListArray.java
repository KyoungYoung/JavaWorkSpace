package Basic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("오렌지");
//        list.remove(1);
        //get, 1개
        //contains, boolean
        if (list.contains("오렌지")) {
            System.out.println("true입니다.");

        }

        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}

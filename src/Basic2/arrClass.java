package Basic2;

public class arrClass {
    public static void main(String[] args) {
        Comics c1 = new Comics("아이언맨","토니 스타크");
        Comics c2 = new Comics("캡틴 아메리카","크리스 에반스");
        Comics c3 = new Comics();
        c3.name = "스파이더맨";
        c3.chractor = "톰 홀랜드";

        Comics[] coArr = {c1, c2, c3};
//        System.out.println(coArr);
        for (int c = 0; c < coArr.length; c++) {
            System.out.println(coArr[c].toStr());
        }
        System.out.println(c1.toStr());
        System.out.println(c2.toStr());
        System.out.println(c3.toStr());
    }
}

class Comics {
    String name;
    String chractor;

    public Comics(String n, String c) {
        name = n;
        chractor = c;
    }
    Comics(){}
    String toStr() {
        return String.format("만화 이름:{%s}, 주인공:{%s}", name, chractor);
    }
}

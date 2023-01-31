package Basic2;

public class SquareClass {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 10;
        s1.area();
    }

}

class Square{
    int length;

    void area(){
        int result = length * length;
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이는 %d이다.",length,result);
    }
}

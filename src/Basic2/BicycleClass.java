package Basic2;

public class BicycleClass {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();

        b1.name = "산악 자전거";
        b1.weight = 7.25;
        b1.price = 326000;

        System.out.printf("b1의 정보: {%s, %.2f kg , %d원}\n",b1.name,b1.weight,b1.price);
        b1.move();
        b1.horn();
    }
}

class Bicycle{
    String name;
    double weight;
    int price;

    void move() {
        System.out.println("자전거를 타고 이동합니다.");
    }
    void horn(){
        System.out.println("따르르릉! 지나갈게요!");
    }
}

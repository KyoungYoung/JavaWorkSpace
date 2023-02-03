package Basic2;

public class BycicleNew {
    public static void main(String[] args) {
        Bicycle1 b1 = new Bicycle1("myB", 13.21, 200000);

        System.out.printf("자전거: %s, %.2f, %d", b1.name, b1.weight, b1.price);

    }
}

class Bicycle1 {
    String name;
    double weight;
    int price;

    Bicycle1(String n, double w, int p) {
        name = n;
        weight = w;
        price = p;
    }

}

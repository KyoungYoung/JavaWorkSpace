package Basic2;

public class HongP1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.3);
        c1.area();
    }
}

class Circle {
    final double r = Math.PI;
    double length;

    Circle(double length) {
        this.length = length;
    }

    void area() {
        double result = r * (length * length);
        System.out.printf("원의 넓이는 %.2f",result);
    }
}
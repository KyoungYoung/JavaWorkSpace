package Basic2;

public class Over {
    public static void main(String[] args) {
        double r = 3.5;
        Computer c = new Computer();
        System.out.println(String.format("%.2f", c.areaCircle(r)));

    }
}

class Calculator {
    public double areaCircle(double r) {
        System.out.println("실행");
        return 3.14159 * r * r;
    }
}

class Computer extends Calculator {
    public double areaCircle(double r) {
        double result = Math.PI * r * r;
        return result;
    }
}

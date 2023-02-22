package Basic2;

public class Anonymous {
    public static void main(String[] args) {
        IAnimal a = new IAnimal() {
            @Override
            public String bark() {
                return "멍멍";
            }

            @Override
            public String run() {
                return "달리기!";
            }
        }  ;
        System.out.println(a.bark());
        System.out.println(a.run());
    }
}

interface IAnimal {
    public String bark();
    public String run();
}


package Basic2;

public class CatClass {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.printf("이름: %s\n", d.name);
        System.out.printf("품종: %s\n", d.breeds);
        System.out.printf("나이: %d\n", d.age);
        d.wag();
        d.bark();
    }
}

class Dog {
    String name = "jaerong";
    String breeds = "maltiz";
    int age = 24;

    void wag() {
        System.out.println("꼬리 흔들기!");
    }
    void bark(){
        System.out.println("멍멍 짖는다.");
    }

}

package Basic2;

public class ScopeCat {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "페르시안 고양이";
        c1.breed = "장모";
        c1.age = 2;

        c1.bre();
        c1.meow();
        c1.ageCat();
    }
}

class Cat{
    String name;
    String breed;
    int age;

    void meow() {
        System.out.printf("%s의 야옹야옹!\n",name);
    }
    void  bre(){
        System.out.printf("%s의 품종은 %s입니다.\n",name,breed);
    }
    void ageCat(){
        System.out.printf("%s의 나이는 %d입니다.\n",name,age);
    }
}

package Basic2;

public class HongP5 {
    public static void main(String[] args) {
        Knight1 n1 = new Knight1("김경영", 30);
        n1.setHp(50);
        System.out.println(n1.getHp());
    }
}

class Knight1 {
    private String name;
    private int hp;

    public Knight1(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getHp() {
        return String.format("%s의 hp는 {%d}", this.name, this.hp);
    }

    public void setHp(int hp) {
        this.hp = hp;

    }
}

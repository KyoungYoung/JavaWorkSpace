package Basic2;

public class HongP3 {
    public static void main(String[] args) {
        Em p1 = new Em("김경영",new int[]{5,5,6,8,5});
        Em p2 = new Em("현혜민",new int[]{4,4,4,4,4});

        p1.printTotalHours();
        System.out.println(p1.totalHours());
        p2.printTotalHours();
        System.out.println(p2.totalHours());
    }
}

class Em{
    String name;
    int[] hour;

    public Em(String name, int[] hour) {
        this.name = name;
        this.hour = hour;
    }

    void printTotalHours() {
        for (int i = 0; i < hour.length; i++) {
            System.out.println(hour[i]);
        }
    }
    String totalHours(){
        int total = 0;
        for (int i = 0; i < hour.length; i++) {
            total += hour[i];
        }
        return String.format("%s의 토탈 일한 시간은 : %d 시간 입니다.", name, total);

    }
}
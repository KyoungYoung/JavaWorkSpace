package FastCampusJava1;

public class HelloTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String aa = Integer.toString(a);
        String ab = String.valueOf(a);
        System.out.println(aa+10);
        System.out.println(ab+10);

        int c = 10;
        int d = 20;
        int temp;
        temp = c;
        c = d;
        d = temp;
        System.out.println(temp);
        System.out.println(c);
        System.out.println(d);

        byte value = 127;
        //(1byte = 8bit, -2의 8승 <= 값 <= 2의 8승 - 1)
        value++;
        System.out.println(value);

        byte value2 = -128;
        value2--;
        System.out.println(value2);
    }
}

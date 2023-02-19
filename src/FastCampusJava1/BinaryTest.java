package FastCampusJava1;

public class BinaryTest {
    public static void main(String[] args) {

        int decimal = 123;
        int binary = 0b1111011;
        int octal = 0173;
        int hexa = 0x7B;

//        System.out.println(decimal);
//        System.out.println(binary);
//        System.out.println(octal);
//        System.out.println(hexa);

        String binaryS = Integer.toBinaryString(decimal);
        String octalS = Integer.toOctalString(decimal);
        String hexaS = Integer.toHexString(decimal);
        int decimalS = Integer.parseInt(octalS);

        System.out.println(binaryS);
        System.out.println(octalS);
        System.out.println(hexaS);
        System.out.println(decimalS);
    }
}

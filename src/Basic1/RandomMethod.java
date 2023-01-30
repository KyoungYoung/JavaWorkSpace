package Basic1;

import java.util.Random;
import java.util.Scanner;

public class RandomMethod {

    public static int randomNumber;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        randomNumber = random.nextInt(256);
        int attempt = 0;
        System.out.println(randomNumber);
        System.out.println("숫자를 입력하세요");
        while (attempt < 10) {
            int myNum = scanner.nextInt();
            if (myNum > randomNumber){
                System.out.println("큽니다.");
            } else if (myNum < randomNumber) {
                System.out.println("작습니다.");
            }else {
                System.out.println("일치합니다.");
                break;
            }
            attempt++;

            System.out.println(myNum);
        }

    }
}

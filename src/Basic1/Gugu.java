package Basic1;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        /*for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j  + " = "+ i * j);
            }
        }*/
        /*int a = 0;
        while (a < 10) {
            System.out.println("현재 반복 횟수 : " + a);
            a++;
        }*/

        String password = "1234a";
        System.out.println("비밀번호를 입력해주세요");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputPassWord = scanner.nextLine();
            if (inputPassWord.equals(password)) {
                System.out.println("로그인 하였습니다.");
                break;
            } else {
                System.out.println("다시 시도해 주세요");
            }
        }

    }
}

package Basic1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Basic1/output01.txt");
        } catch (IOException e) {
            System.out.println("file nonStart");
            System.exit(1);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료하려면 입력 없이 엔터를 누르세요.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("파일 입력을 종료합니다.");
                break;
            }
            try {
                writer.write(input);
            } catch (IOException e) {
                System.out.println("데이터를 쓰는데 실패했습니다.");
                System.exit(2);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }



}

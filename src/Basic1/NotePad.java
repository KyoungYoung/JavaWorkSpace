package Basic1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotePad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메모장에 오신걸 환영합니다.");

        while (true) {
            System.out.println("원하시는 작업 번호를 선택하세요!");
            System.out.println("1. 새 메모 작성");
            System.out.println("2. 메모 읽기");
            System.out.println("3. 종료");
            int myNum;

            try {
                String inputNumber = scanner.nextLine();
                myNum = Integer.parseInt(inputNumber);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }

            // 쓰기
            if (myNum == 1) {
                System.out.println("저장할 메모 파일명을 입력하세요.");
                String fileName = scanner.nextLine();
                FileWriter writer;
                try {
                    writer = new FileWriter("src/Basic1/"+fileName);
                } catch (IOException e) {
                    System.out.println("메모장 생성이 실패하였습니다.");
                    continue;
                }
                System.out.println("메모장에 적을 내용을 입력하세요.");
                System.out.println("적을 내용이 없다면 빈 줄에서 엔터 입력");
                while (true) {
                    String inputWord = scanner.nextLine();
                    if (inputWord.equals("")) {
                        break;
                    }
                    try {
                        writer.write(inputWord);
                    } catch (IOException e) {
                        System.out.println("내용을 입력해주세요");
                    }

                }
                    try {
                        writer.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
            // 읽기
            else if (myNum == 2) {
                System.out.println("메모 파일명을 입력하세요.");
                String fileName = scanner.nextLine();
                FileInputStream inputStream;
                try {
                    inputStream = new FileInputStream("src/Basic1/"+fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일을 읽어오지 못했습니다.");
                    continue;
                }
                System.out.println(fileName + "의 내용을 출력합니다.");
                Scanner reader = new Scanner(inputStream);
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                    System.out.println("\n");
                reader.close();
            } else if (myNum == 3) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("1~3번 안에서 다시 입력해주세요 ");
            }
        }
    }
}

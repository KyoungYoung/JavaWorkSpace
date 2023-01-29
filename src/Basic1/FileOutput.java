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
        try {
            writer.write("test text입니다.");
            writer.close();
        } catch (IOException e) {
            System.out.println("데이터를 쓰는데 실패했습니다.");
            System.exit(2);
        }
    }



}

package Basic1;

import java.util.Scanner;

public class HelloJ {
    public static void main(String[] args) {
        /*String n = "치킨은 살 안쪄요";
        System.out.println(n.replaceAll("치킨","회"));
        String dayDay = "1998/12/14";
        String newDay = dayDay.substring(5);
        System.out.println(newDay);*/
/*        String a = "10";
        int aa = Integer.parseInt(a);
        System.out.println(aa + 10);*/

        /*System.out.println("영단어와 한글단어 입력하세요!");
        Scanner input = new Scanner(System.in);
        String englishWord = input.next();
        String koreanWord = input.next();
        System.out.println("단어 변경 : " + englishWord +" -> " + koreanWord);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요!");
        String dollar = scanner.nextLine();
        System.out.println("해장국값을 입력하세요!");
        String haejanguk = scanner.nextLine();
        try {
            double exchange = Double.parseDouble(dollar);
            double koreanHaejanguk = Double.parseDouble(haejanguk);
            double dollarPrice = Math.round(koreanHaejanguk / exchange);
            System.out.println("해장국의 달러값은? : " + dollarPrice + "달러 입니다.");
        }
        catch (Exception e){
            System.out.println("숫자를 입력해주세요");
        }*/

        /*int age = 10;
        if (age < 20 && age > 5) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("애기입니다.");
        }*/

        /*String a = "kky";
//        String b = "kky";
        String b = scanner.nextLine();
        System.out.println(a == b );
        System.out.println(a.equals(b) );*/

        int month;
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            month = Integer.parseInt(input);
        } catch (Exception e) {
            month = -1;
        }
        switch (month) {
            case 1:
                System.out.println("1월");
                break;
            case 2:
                System.out.println("2월");
                break;
            default:
                System.out.println("선택권이 없습니다.");
        }
    }
}

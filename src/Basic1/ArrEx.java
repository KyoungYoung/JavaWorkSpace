package Basic1;

import java.util.Random;
import java.util.Scanner;

public class ArrEx {
    public static void main(String[] args) {
        /*String[] days = {"월", "화", "수"};
        String[] day = Arrays.copyOf(days,4);
        System.out.println(day);
        System.out.println(Arrays.toString(day));*/

      /*  Random random = new Random();
        int rand = random.nextInt(24);
        System.out.println(rand);*/

//        System.out.println("지금 무슨 생각을 하고 있나요?");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("치킨");
//    }

        System.out.println("숫자 맞추기 게임!");
        System.out.println("0~255까지의 숫자를 랜덤으로 나타낼게요 !! 그리고 up & down으로 알려줄테니 맞춰보세요!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(256);
        int count = 10;
        while (count > 0) {
            System.out.println("숫자를 입력하세요, 기회는 " + count + "번 남았습니다.");
            int inputNumber = scanner.nextInt();
            if (inputNumber < randomNumber) {
                System.out.println("Up");
            } else if (inputNumber > randomNumber) {
                System.out.println("Down");
            } else {
                System.out.println("축하합니다. 맞추셨습니다.");
                break;
            }
            count--;

        }
//        for (int count = 10; count > 0; count--) {
//
//            System.out.println("숫자를 입력하세요, 기회는 " + count + "번 남았습니다.");
//            int inputNumber = scanner.nextInt();
//            if (inputNumber < randomNumber) {
//                System.out.println("Up");
////                count -= 1;
//            } else if (inputNumber > randomNumber) {
//                System.out.println("Down");
////                count -= 1;
//            }else if(randomNumber == inputNumber){
//                System.out.println("축하합니다. 맞추셨습니다!");
//                break;
//            }

        }
//        while (count > 0) {
//        }


    }



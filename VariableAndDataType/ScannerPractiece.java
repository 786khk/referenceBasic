package VariableAndDataType;

import java.util.Scanner;

public class ScannerPractiece {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름");

        String keyword = scanner.next();

        System.out.println("입력한 답 : " + keyword);
        System.out.println(keyword+"님, 오늘 힘들었음? true/false로 답하긔");

        boolean isTrue = scanner.nextBoolean();

        System.out.println("입력 : "+ isTrue);
        System.out.println("뭐가 제일힘듦?");

        //scanner.nextLine(); //엔터 처리

        String sentence = scanner.nextLine();

        System.out.println("입력 : "+ sentence);
        System.out.println("그럼 100점 만점에서 몇점?");

        int score = scanner.nextInt();

        System.out.println("입력한 답 : " + score+"고생혀따");
        
        scanner.close();


        
    }
}

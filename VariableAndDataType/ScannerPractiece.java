package VariableAndDataType;

import java.util.Scanner;

public class ScannerPractiece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘도 열심히 산 당신의 성함이 어떻게 되실까요?");

        String keyword = scanner.next();

        System.out.println("입력한 답 : " + keyword);
        System.out.println(keyword+"님 오늘도 열심히 살았나요?맞다면 true를, 틀리면 false를 입력하세요.");

        boolean isTrue = scanner.nextBoolean();

        System.out.println("입력 : "+ isTrue);
        System.out.println("오늘을 한 문장으로 표현하자면?");

        scanner.nextLine(); //엔터 처리

        String sentence = scanner.nextLine();

        System.out.println("입력 : "+ sentence);
        System.out.println("그럼 100점 만점에서 몇점인가요?");

        int score = scanner.nextInt();

        System.out.println("입력한 답 : " + score);


        
    }
}

package controlStatement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자맞추기 게임을 시작하겠습니다. \n 준비되셨으면 '시작'을 입력하세요. ");
        String startWord = scanner.next();
        int controlNumber=5; 
        scanner.nextLine();
        if(startWord.contains("시작")){
            System.out.println(controlNumber+"보다 작나요? \t 맞다면 'yes'를, 아니면 'no'를 입력하세요'");
            String answer1 = scanner.next();
            if(answer1.equals("yes")){
                controlNumber = controlNumber-2;
                System.out.println( controlNumber+"이군요!");

            }else if(answer1.equals("no")){
                controlNumber = controlNumber + 2;

                System.out.println(controlNumber + "이군요!" );

            }
        }else{
            throw new Error("제시한 단어만 입력해 주세요.");
        }

    }
}

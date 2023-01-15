package controlStatement;

import java.util.Scanner;

public class RepeatingSentenceWhile {
    public static void main(String[] args) {
    

        // int value = 1;

        // while(value<=9){
        //     ++value;
            // if(value>9){
            //     break;
            // }
        // }
        // System.out.println(value);

        // do while

        Scanner scanner = new Scanner(System.in);

        int i=0;

        do{
            System.out.println("제곱근을 알고싶은 숫자를 입력하세요.(그만은 0)");
            i=scanner.nextInt();
            System.out.println(i+"의 제곱근은 : "+ Math.sqrt(i));
        }while(i>0);


    }
}

package Thread;

import javax.swing.JOptionPane;

public class ThreadEx14 {
    public static void main() {
        
        ThreadEx14_1 t1 = new ThreadEx14_1();
        t1.start();
        String input = JOptionPane.showInputDialog("입력 ㄱㄱ");
        System.out.println("입력하신 값은 " + input + "입니다.");
        System.out.println("isInterrupted : " + t1.isInterrupted()); 
        t1.interrupt();//interrupt()호출시 InterruptedException발생, isInterrupt()가 true
        System.out.println("isInterrupted : " + t1.isInterrupted()); 
    
        /**
            interrupt가 호출되어도 카운트가 종료되지않앗는데 이 이유는 
            InterruptedException가 발생했기때문
            10
            9
            8
            입력하신 값은 ddddd입니다.
            isInterrupted : false
            isInterrupted : false
            7
            6
            5
            4
            3
            2
            1
            카운트 종료 
         */

         /*ThreadEx14_1.run()의 catch문에 interuppt()추가후 실행
            10
            9
            8
            입력하신 값은 dsd입니다.
            isInterrupted : false
            isInterrupted : true
            카운트 종료
          */
    
    }
}
class ThreadEx14_1 extends Thread{
    public void run(){
        int i=10;
        while(i!=0 && !isInterrupted()){
            System.out.println(i--);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //입력값이 있어도 카운트 종료가안돼 추가함
                // interrupt(); // 추가 후 카운트 중간에 중단
            }
        }
        System.out.println("카운트 종료");

    }
}
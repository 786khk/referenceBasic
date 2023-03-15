package Thread;

import javax.swing.JOptionPane;

public class ThreadEx7 {
    public static void main(){

        ThreadEx7_1 thread = new ThreadEx7_1();
        thread.start();

        String input = JOptionPane.showInputDialog("입력 ㄱㄱ");
        System.out.println("입력값은 : " + input+"입니다.");

       
    }

    /*
     result:
        입력값에 대한 응답이 없어도 for문이 실행
        그리고 카운트가 끝나도 입력을 기다렷다가 입력을 받고나서 종료.
      
     */
}

class ThreadEx7_1 extends Thread{
    public void run(){
        for(int i =10; i>0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
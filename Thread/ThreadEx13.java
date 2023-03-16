package Thread;

import javax.swing.JOptionPane;

public class ThreadEx13 {
    public static void main() {
        ThreadEx13_1 t1 = new ThreadEx13_1();
        t1.start();
        String input = JOptionPane.showInputDialog("입력 ㄱㄱ");
        System.out.println("입력하신 값은 " + input + "입니다.");
        t1.interrupt();
        System.out.println("isInterrupted : " + t1.isInterrupted()); 
    }
}

class ThreadEx13_1 extends Thread{
    public void run(){
        int i=10;
        while(i!=0 && !isInterrupted()){
            System.out.println(i--);

            for(long x=0; x<25000000L;x++); //시간지연
        }
        System.out.println("카운트 종료");
    }
}
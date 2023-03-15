package Thread;

import javax.swing.JOptionPane;

public class ThreadEx6 {
    public static void main(){
        String input = JOptionPane.showInputDialog("입력 ㄱㄱ");
        System.out.println("입력값은 : " + input+"입니다.");

        for(int i =10; i>0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    /*
     result:
        입력값이 있을때까지 기다렸다가 for문이 실행됨
      
     */
}

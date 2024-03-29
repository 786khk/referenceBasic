package Thread;

public class ThreadEx12 {
    public static void main(){
        ThreadEx12_1 t1 = new ThreadEx12_1();
        ThreadEx12_2 t2 = new ThreadEx12_2();

        t1.start();
        t2.start();

        try {
            t1.sleep(2000);//
        } catch (Exception e) {}
        System.out.print("main 스레드 종료");
        /**-----------------||||||||||||||||||||
         * |||||||||||||||||||||||||||||||||||||
         * ||||||||||||||||||||||||||||||-------
         * --------------------------------------
         * -------------------------------------
         * --------------------------------------
         * --------||||||----|||||-----
         * --------------------------------------
         * --------------------------------------
         * --------------------------------------
         * ----------------||||||||||||----------
         * ------||||||||||||||||||||||||||||||||
         * ||||||||||||||||||||||||||||||||||||||
         * ||||||||||||||||||||||||||||||||||||||
         * ||th1 종료||||||||||||||||||||||||||||
         * ||||||||||||||||||||||||||||||||||||||
         * ||||||||||||||th2 종료 main스레드 종료*/
        //sleep()은 현재 스레드에 대해서만 작동

    }
}
class ThreadEx12_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++) System.out.print("-");
        
        System.out.print("th1 종료");
    }
}
class ThreadEx12_2 extends Thread{
    public void run(){
        for(int i=0; i<300; i++) System.out.print("|");
        
        System.out.print("th2 종료");
    }
}
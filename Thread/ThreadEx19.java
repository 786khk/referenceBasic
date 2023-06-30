package Thread;

public class ThreadEx19 {
    static long startTime=0;
    public static void main() {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.print("소요시간 : "+ (System.currentTimeMillis()- ThreadEx19.startTime));
       
    }
}

class ThreadEx19_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.print(new String("1"));
        }
    }
}
class ThreadEx19_2 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.print(new String("2"));
        }
    }
}

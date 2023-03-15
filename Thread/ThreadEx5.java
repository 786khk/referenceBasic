package Thread;

public class ThreadEx5 {
    static long startTime = 0; // 시간을 재기 위해 static으로 변수선언
    public static void main(){
        ThreadEx5_1 th5 = new ThreadEx5_1();
        th5.start();
        startTime = System.currentTimeMillis();
        for(int i=0; i<300; i++) System.out.printf("%s", new String("-"));

        System.out.print("소요시간 1:" + (System.currentTimeMillis()-ThreadEx5.startTime));
    }
}
class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++) System.out.printf("%s", new String("|"));

        System.out.print("소요시간 2:" + (System.currentTimeMillis()-ThreadEx5.startTime));
    }
}
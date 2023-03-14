package Thread;

public class ThreadEx3 {
    public static void main(){
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
        /**
         ThreadEx2는 start()실행 했고 지금 현재 ThreadEx3는 run()했다.
         실행을 하게되면 메인스레드가 종료되지않ㅡㄴ건가?
         
         * java.lang.Exception
        at Thread.ThreadEx3_1.throwException2(ThreadEx3.java:17)
        at Thread.ThreadEx3_1.run(ThreadEx3.java:13)
        at Thread.ThreadEx3.main(ThreadEx3.java:6)
        at Thread.Main.main(Main.java:11)
         */
    }

}

class ThreadEx3_1 extends Thread{
    public void run(){
        throwException2();
    }
    public void throwException2(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
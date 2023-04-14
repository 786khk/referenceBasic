package Thread;

public class ThreadEx15 {
    public static void main() {
        
        RunnableEx15 r = new RunnableEx15();
        Thread t1 = new Thread(r,"*");
        Thread t2 = new Thread(r,"**");
        Thread t3 = new Thread(r,"***");
    
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(2000);// 스레드를 2초멈추게 하지만 2초 후 바로 실행대기상태가 됨
            t1.suspend();
            Thread.sleep(2000);
            t2.suspend();
            Thread.sleep(3000);
            t1.resume();
            Thread.sleep(3000);
            t1.stop();
            t2.stop();
            Thread.sleep(2000);
            t3.stop();

            
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}

class RunnableEx15 implements Runnable{
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

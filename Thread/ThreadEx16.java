package Thread;

public class ThreadEx16 {
    public static void main() {
        
        RunnableEx16 r1 = new RunnableEx16();
        RunnableEx16 r2 = new RunnableEx16();
        RunnableEx16 r3 = new RunnableEx16();
        Thread t1 = new Thread(r1,"*");
        Thread t2 = new Thread(r2,"**");
        Thread t3 = new Thread(r3,"***");
    
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(2000);// 스레드를 2초멈추게 하지만 2초 후 바로 실행대기상태가 됨
            r1.suspend();
            Thread.sleep(2000);
            r2.suspend();
            Thread.sleep(3000);
            r1.resume();
            Thread.sleep(3000);
            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();

            
        } catch (InterruptedException e) {}
    }
}

class RunnableEx16 implements Runnable{
    boolean suspenced = false;
    boolean stoped = false;
    public void run(){
        while(!stoped){
            if(!suspenced){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}

            }
        }
        System.out.println(Thread.currentThread().getName() + "-stop");

    }
    public void suspend() {suspenced = true;}
    public void resume() {suspenced = false;}
    public void stop() {stoped = false;}
}

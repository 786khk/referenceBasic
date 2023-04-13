package Thread;

public class ThreadEx17 {
    public static void main() {
        ThreadEx11_1 th1 = new ThreadEx11_1("*");
        ThreadEx11_1 th2 = new ThreadEx11_1("**");
        ThreadEx11_1 th3 = new ThreadEx11_1("***");
        th1.start();
        th2.start();
        th3.start();
        
        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();

        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}

class ThreadEx17_1 implements Runnable{
    volatile boolean suspended = false;
    volatile boolean stoped = false;
    Thread th;

    ThreadEx17_1(String name) { 
        th = new Thread(this, name);
    }

    public void run(){
        while(!stoped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }

    public void suspend(){ suspended = true;}
    public void resum(){suspended = false;}
    public void stop(){stoped = true;}
    public void start(){th.start();}
    
}

package Thread;

public class ThreadEx {
    public static void main(){
        ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread 자손 클래스 인스턴스 생성
        Runnable r = new ThreadEx1_2(); //Runnable구현
        Thread t2 = new Thread(r);// 생성자 Thread(Runnable target)

        Thread t3 = new Thread(new ThreadEx1_2());
        t1.start();
        t2.start();
        // t2.start();
        /*
        Thread-0
        Exception in thread "main" Thread-0
        Thread-0
        java.lang.IllegalThreadStateException
        Thread-0
        Thread-1
        Thread-1
        Thread-0
        Thread-1
        Thread-1
        Thread-1
                at java.base/java.lang.Thread.start(Thread.java:793)
                at Thread.ThreadEx.main(ThreadEx.java:14)
                at Thread.Main.main(Main.java:6) */

                t2 = new Thread(r);
                t2.start();
    }
}
class ThreadEx1_1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(getName()); // 부모인 Thread의 getName() 호출
        }
    }
}

class ThreadEx1_2 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());

            /**위 코드는 아래의 코드를 줄여쓴것.
             * Thread t = Thread.currentThread().getName();
             * String name = t.getName();
             * System.out.println(name);
             */
        }
    }
}
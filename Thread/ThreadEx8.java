package Thread;

public class ThreadEx8 {
    static long startTime = System.currentTimeMillis();
    public static void main(){
        ThreadEx8_1 t1 = new ThreadEx8_1();
        ThreadEx8_2 t2 = new ThreadEx8_2();

        // t2.setPriority(7);
        t1.setPriority(7);
        System.out.println(System.currentTimeMillis() - startTime);

        System.out.println("Priority t1 (-)" + t1.getPriority());
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("Priority t2 (|)" + t2.getPriority());
       


        t1.start();
        t2.start();
    }
}
class ThreadEx8_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.print("-");
            for(int j=0; j<10000000; j++);

        }
    }
}

class ThreadEx8_2 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.print("|");
            for(int j=0; j<10000000; j++);

        }
    }
}
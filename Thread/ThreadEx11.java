package Thread;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx11 {
    public static void main(){
        ThreadEx11_1 t1 = new ThreadEx11_1("thread1");
        ThreadEx11_2 t2 = new ThreadEx11_2("thread2");

        t1.start();
        t2.start();
    }
}
class ThreadEx11_1 extends Thread{
    ThreadEx11_1(String name){
        super(name);
    }
    public void run(){
        try {
            sleep(5* 1000);
        } catch (Exception e) {
            // TODO: handle exception
        }


    }

}

class ThreadEx11_2 extends Thread{
    ThreadEx11_2(String name){
        super(name);
    }

    public void run(){
        Map map = getAllStackTraces(); // 대기, 실행중인 작업상태의 모든 스레드가 담겨있다.
        System.out.println(map);
        Iterator it= map.keySet().iterator();
        int x=0; 

        while(it.hasNext()){ // 스택에 들어있다면 
            Object obj = it.next();
            Thread t = (Thread)obj;
            StackTraceElement[] ste  = (StackTraceElement[]) (map.get(obj));

            System.out.println("["+ ++x +"] name : " + t.getName()+ ", group :"+ t.getThreadGroup().getName()+", deamon : " + t.isDaemon());
            for(int i=0; i<ste.length; i++) System.out.println(ste[i]);
        }
        System.out.println();
        
        
    }
}


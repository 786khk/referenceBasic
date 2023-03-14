package Thread;

public class ThreadEx2 {
    public static void main(){
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();

        /**
        java.lang.Exception
        at Thread.ThreadEx2_1.throwException(ThreadEx2.java:16) => 호출 스택 2 
        at Thread.ThreadEx2_1.run(ThreadEx2.java:11) => 호출 스택 1
        main()은 이미 종료됨
         */
    }
}
class ThreadEx2_1 extends Thread{
    public void run(){
        throwException();
    }

    public void throwException(){
        try {
            throw new Exception();
            
        } catch (Exception e) {
            e.printStackTrace(); //고위 예외 발생
            // TODO: handle exception
        }
    }
}
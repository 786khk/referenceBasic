package Exception;

public class ExceptionEx12 {
   
    public static void main(String[] args) throws Exception {
        methods1();
     /**
      * Exception in thread "main" java.lang.Exception
        at Exception.ExceptionEx12.methods2(ExceptionEx12.java:21)
        at Exception.ExceptionEx12.methods1(ExceptionEx12.java:18)
        at Exception.ExceptionEx12.main(ExceptionEx12.java:6)
      */
      /**
       * 호출 스택에 main, methods1,methods2모두 있었다.
       * 예외가 발생한 곳은 methods2()이다.
       * 
       * 호출스택에 
       * methods2()
       * methods1()
       * main()
       * ㅇ 있는데 ( 스택인 first in last out이기떄문에가장 상위에 있는 main이 가장 아래에 있음)
       *  
       */

    }
    static void methods1() throws Exception{
        methods2();
    }
    static void methods2()throws Exception{
        throw new Exception(); 
        // 예외 강제 발생했지만 try ~ catch문으로 예외처리를 안해줬으니
        // methods2종료되면서 methods1에 예외전달, methods1도 똑같이 예외를 main에 전달
    }
    //비정상 종료

}

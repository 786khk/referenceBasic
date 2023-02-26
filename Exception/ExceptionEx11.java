package Exception;

public class ExceptionEx11 {
   
    public static void main(String[] args) {
        throw new RuntimeException(); // 컴파일은 되지만 비정상 종료
        //Exception in thread "main" java.lang.RuntimeException        
        // at Exception.ExceptionEx11.main(ExceptionEx11.java:6)

    }
}

package Exception;

import java.io.File;

public class ExceptionEx17 {
   
    public static void main(String[] args) throws Exception {
        try {
            methods1();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }

    static void methods1() throws Exception{
        try {
            throw new Exception(); 
            
        } catch (Exception e) {
            System.out.println("methods1 메서드 내 예외처리 되었습니다.");
            throw e;
        }
    }

}

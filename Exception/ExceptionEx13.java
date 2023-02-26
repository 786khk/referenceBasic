package Exception;

public class ExceptionEx13 {
   
    public static void main(String[] args) throws Exception {
        methods1();
    }

    static void methods1() throws Exception{
        try {
            // methods2();
            throw new Exception(); 
            
        } catch (Exception e) {
            System.out.println("메서드 내 예외처리 되었습니다.");
            e.printStackTrace(); //예외정보 출력
            /**
             * java.lang.Exception
                at Exception.ExceptionEx13.methods1(ExceptionEx13.java:29)
                at Exception.ExceptionEx13.main(ExceptionEx13.java:6)
             */

        }
    }


}

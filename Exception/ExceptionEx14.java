package Exception;

public class ExceptionEx14 {
   
    public static void main(String[] args) throws Exception {
        try {
            methods1();
        } catch (Exception e) {
            System.out.println("main 메서드 내 예외처리 되었습니다.");
            e.printStackTrace();
            /*
                java.lang.Exception
                at Exception.ExceptionEx14.methods1(ExceptionEx14.java:17)
                at Exception.ExceptionEx14.main(ExceptionEx14.java:7)  
             
            */
        
        }
    }

    static void methods1() throws Exception{
            // methods2();
            throw new Exception(); 
            
    }


}

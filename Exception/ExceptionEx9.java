package Exception;

public class ExceptionEx9 {
   
    public static void main(String[] args) {
        try {
           Exception e = new Exception("고의"); // "고의" 라는 String message를 Exception에 전달
           throw e;

            
        } catch (Exception  e) {
            e.printStackTrace();
            System.out.println("예외 : " + e.getMessage());// String message 를 통해 고의로 발생시킨메세지 얻을 수 있다.
        }
        System.out.println("정상종료");
    }
}

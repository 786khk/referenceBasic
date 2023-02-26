package Exception;

public class ExceptionEx8 {
   
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); //ArithmeticException
            System.out.println(4); //실행암됨
            
        } catch (ArithmeticException  ae) {
            ae.printStackTrace();
            System.out.println("예외 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}

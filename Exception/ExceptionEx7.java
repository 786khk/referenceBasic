package Exception;

public class ExceptionEx7 {
   
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); //ArithmeticException
            System.out.println(4); //실행암됨
            
        } catch (ArithmeticException  ae) {
            if(ae instanceof Exception) System.out.println("같음");
            // System.out.println(0/0); 으로 ArithmeticException발생해서 catch 실행
            System.out.println("ArithmeticException");
        }catch (Exception e) {
            System.out.println("Exception");
            // catch (ArithmeticException  ae) 이 실행되어서 더이상의 예외가 없으니 여기는샐행되지않음
            //
        }
        System.out.println(6);
    }
}

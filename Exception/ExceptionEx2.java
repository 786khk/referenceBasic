package Exception;

public class ExceptionEx2 {
   
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
    
        for (int i=0; i<10; i++){
            result = num/(int)( Math.random() * 10);
            System.out.println(result); //java.lang.ArithmeticException: / by zero
            // Math.random()0~9까지 램덤으로 나오는데 0으로 나눌 수 없어 에러
        }
    }
}

package operation;

public class InfinityAndNan{
    public static void main(String[] args) {
      try {
        
            // int i1 = 1 / 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero
            // int i2 = 1 % 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero
        
            // System.out.println("연산 결과  i1: "+i1+ "\t i2: " + i2);
        
        
            double d1 = 1/0.0; // Infinity
            double d2 = 1%0.0; // Nan
        
            double d3 = d1 + 100; // Infinity
            double d4 = d2 + 100; // Nan
        
            System.out.println("double형태 연산 \t d1 : " + d1 + " d2 : " + d2 + ",\r\n d3 : " + d3 + ", d4 : "+ d4);

            isInfinityOrNan(d3);
            isInfinityOrNan(d4);


      } catch (ArithmeticException e) {
        System.out.println("ArithmeticException 에러 발생");
      }


      
    }
   
    public static void isInfinityOrNan(double value){
        if(Double.isInfinite(value)|| Double.isNaN(value)){
            System.out.println("이값은 무한대(infinity) 또는 숫자형이 아니기에 (Nan)사용할 수 없습니다.");
        }else if(Double.isFinite(value)){
            System.out.printf("해당 값은 계산이 가능하다.value : %f%n",value);
            System.out.printf("value : %f%n", value);

        }
    } 



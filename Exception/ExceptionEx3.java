package Exception;

public class ExceptionEx3 {
   
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
    
        for (int i=0; i<10; i++){
            try {
                result = num/(int)( Math.random() * 10);
                System.out.println(result);
                /**
                 * 12
                    11
                    16
                    14
                    50
                    12
                    11
                    16
                    25
                    12
                 */
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(0); // 에외일때만  0 출력한다.
                /*
                 * 11
                    14
                    25
                    20
                    0
                    33
                    50
                    12
                    100
                    0
                 */
                // 결과는 위와같은데 만약 예외처리를 안했다면 11,14,25,20까지만 출력되고 멈췄을것
            }
        }
    }
}

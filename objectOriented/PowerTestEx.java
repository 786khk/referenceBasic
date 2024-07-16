package objectOriented;

public class PowerTestEx {
    static long power (int x, int y) { // 제곱근 구하는 연산
        
        if(y==1) return x;
        return x * power(x, y-1);

    }

    public static void main(){
    // x의 제곱근값의 누적 합을 구하는 문제
        int x = 2;
        int y = 5;
        long result = 0;

        for(int i=1; i<=y; i++){
            result += power(x,i); 
            System.out.printf(" for으로 2의 1~5승의 합 연산에 사용된 수 x = %d, y = %d, 결과 : %d%n", x, i, result);

            
        }

        
        System.out.println("result = " + result);
    }
   
}

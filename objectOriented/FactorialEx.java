package objectOriented;

public class FactorialEx {
    public void main(){
        int result = factorial(4);
        System.out.println(result);
    }
    int factorial (int v) {
        int result = 0;
        if(v ==0){ // 매개변수 검증
            result = 1; // 재귀호출되기 전 리턴값을 대입함
            // return 1;

        }else {
            // v--;
            result =v* factorial(v-1);
        }
        return result;
    }
}

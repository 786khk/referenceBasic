package objectOriented;

public class FactorialEx2 {
    static long factorial (int v) {
        
        if(v <=0|| v>20) return -1;
        if(v <=1) return 1; 
        return v * factorial(v-1);

    }
    public static void main(){
        int v = 21;
        long result = 0;

        for(int i=1; i<=v; i++){
            result = factorial(i);
            if(result ==-1){
                System.out.printf("유효하지 않은 값. (0<v<=20) : %d%n",v);
                break;
            }
            System.out.printf("%2d!=%20d%n",i, result);
        }
    }
   
}

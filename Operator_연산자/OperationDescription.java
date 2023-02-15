package Operator_연산자;
import java.time.LocalDateTime;

public class OperationDescription {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = b1+b2; //Type mismatch: cannot convert from int to byte (타입이 다름)

        int ii = b1+b2; // int로 먼저 형변환 된후 연산이 진행됨
        System.out.println(b1/b2); //0
        // byte + byte = (int)byte+(int)byte = int 

        int i2 = 100;
        long l1 = 200;
        // int i3 = i2+l1; // Type mismatch: cannot convert from long to int
        
        long l2 = i2+l1;
        
        System.out.println(l2/i2); //3
        // int + long = (long)int + long = long


     
        // byte b4 = 100+28; // Type mismatch: cannot convert from int to byte

    }
}

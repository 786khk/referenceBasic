package Operator;


public class OperatorEx28{
    public static void main() {
        int x = 0xAB,y= 0xF;

        System.out.printf("x= %#X \t\t %s%n",x, toBinaryString(x) );
        System.out.printf("y= %#X \t\t %s%n",y, toBinaryString(y) );
        System.out.printf("%#X | %#X = %#X \t%s%n",x,y,x|y, toBinaryString(x|y) );
        System.out.printf("%#X & %#X = %#X \t%s%n",x,y,x&y, toBinaryString(x&y) );
        System.out.printf("%#X ^ %#X = %#X \t%s%n",x,y,x^y, toBinaryString(x^y) );
        System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n",x,y,y,x^y, toBinaryString(x^y^y) );
    }

    static String toBinaryString(int z){
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(z);

        return temp.substring(temp.length()-32);
    }
}
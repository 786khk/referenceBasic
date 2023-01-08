package operation;

public class LogicalOpration {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;

        System.out.println("OR(||)연산 : i1은 11보다 크거나 i2가 19보다 작다" + ((i1> 11) || (i2 < 19)));
        System.out.println("OR(||)연산 : i1은 11보다 작거나 i2가 19보다 작다" + ((i1 < 11) || (i2 < 19)));
        System.out.println("OR(||)연산 : i1은 11보다 크거나 i2가 19보다 크다" + ((i1 > 11) || (i2 > 19)));
        System.out.println("OR(||)연산 : i1은 11보다 작거나 i2가 19보다 크다" + ((i1 <11)||(i2>19)) );
        System.out.println("OR(||)연산 : i1은 11보다 크고 i2가 19보다 작다" + ((i1 > 11) & (i2 < 19)));
        System.out.println("OR(||)연산 : i1은 11보다 작고 i2가 19보다 작다" + ((i1 < 11) & (i2 < 19)));
        System.out.println("OR(||)연산 : i1은 11보다 작고 i2가 19보다 크다" + ((i1 < 11) & (i2 > 19)));
        System.out.println("OR(||)연산 : i1은 11보다 크고 i2가 19보다 크다" + ((i1 > 11) & (i2 > 19)));

    }
}

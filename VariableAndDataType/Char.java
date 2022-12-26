package VariableAndDataType;

public class Char{
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '\u0041';
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2); 
        
        int i = 'A' + 1; // A == 65
        System.out.println(i);

        char intToChar = (char)i;
        System.out.println(intToChar);

        int i2 = '가'+1;
        System.out.println(i2);

        // int i3 = "가지" + 1; //char형은 유니코드를 표현할 수 있다. char형의 리터럴은 '', ""은 문자열  
    }
}
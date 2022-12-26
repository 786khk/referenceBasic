package VariableAndDataType;

public class StringPrint {
    public static void main(String[] args) {
        String s1 = "string과 char는 다르다.";
        String s2 = "안녕, \tJAVA의 세계에 온것을 \t환영해";
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("1" + "1"); //11
        System.out.println(1+ "1"); //11
        System.out.println(1 + 1 + "1"); //21       
        System.out.println(1 + "1" + 1); // 111
        System.out.println('1' + '1');//98 
    }
}

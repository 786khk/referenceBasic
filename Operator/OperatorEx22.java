package Operator;

public class OperatorEx22 {
    public static void main() {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
        System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n",str2.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n",str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"abc\") ? %b%n",str2.equalsIgnoreCase("ABC"));
    }
}

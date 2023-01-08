package operation;

public class Comparative {
    public static void main(String[] args) {
        System.out.println('A'>'b'); // false
        System.out.println('A'== 100); // false
        System.out.println(3==3.0); // true
        System.out.println(0.1 + " : "+0.1f+" : "+(0.1==0.1f)); // 0.1 : 0.1 : false
        System.out.println(0.5 + " : " + 0.5f + " : " + (0.5 == 0.5f)); // 0.5 : 0.5 : true

        double d1 = 0.1;
        float f1 = 0.1f;
        System.out.println((int)(d1*10)==(int)(f1*10)); // true
        System.out.println((float) d1==f1); // true

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println((s1==s2)+ " : "+ s1.equals(s2)); // false : true
    }

}

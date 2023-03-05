package utilClass;

public class StringEx2 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "BBB";
        System.out.println("s1.hashCode() = "+ s1.hashCode()
        +"\n s2.hashCode() = " + s2.hashCode()+
        "\n s3.hashCode() = " + s3.hashCode()+
        "\n s4.hashCode = " + s4.hashCode());
        /*
            s1.hashCode() = 64545
            s2.hashCode() = 64545
            s3.hashCode() = 64545
            s4.hashCode = 65538
         */
    }
}

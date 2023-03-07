package utilClass;


public class HashCodeEx1 {
    
    public static void main(String[] args) {
        String s1 = new String("김현경");
        String s2 = new String("김현경");

        System.out.println(s1.equals(s2)); //
        System.out.println(s1.hashCode());//44610937
        System.out.println(s2.hashCode());//44610937

        System.out.println(System.identityHashCode(s1)); //1159190947
        System.out.println(System.identityHashCode(s2)); //925858445
    }
    
}

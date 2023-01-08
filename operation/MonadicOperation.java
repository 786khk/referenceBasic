package operation;

public class MonadicOperation {
    public static void main(String[] args) {
        int i=5;
        i++;
        System.out.println(i);

        int j=++i;
        System.out.println(j++);
        System.out.println(--j);
    }
}

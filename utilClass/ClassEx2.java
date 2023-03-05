package utilClass;

final class Card{
    String kind;
    int num;
    protected Card(String kind,int num){
        this.num = num;
        this.kind = kind;
    }
    Card(){
        this("SPADE",1);
    }
    public String toString(){
        return "kind : "+kind + ", number: "+ num;
    }
}

public class ClassEx2{

    public static void main(String[] args) throws ClassNotFoundException{
        // Class c = "ClassEx2".getClass();//class java.lang.String
        Class c = Class.forName("utilClass.Card");
        Class c1 = java.io.PrintStream.class;
        boolean b =  c.isInstance(new Card());
        System.out.println(c);
        System.out.println(c1);// class java.io.PrintStream
        System.out.println(b);

    }
}

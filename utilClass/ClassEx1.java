package utilClass;

final class Cardd{
    String kind;
    int num;
    Cardd(String kind,int num){
        this.num = num;
        this.kind = kind;
    }
    Cardd(){
        this("SPADE",1);
    }
    public String toString(){
        return "kind : "+kind + ", number: "+ num;
    }
}

public class ClassEx1 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Cardd c1 = new Cardd("HEART",10);      
        Cardd c2 = Cardd.class.newInstance(); //class객체를 통해 객체 생성
        Class obj = c1.getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(obj.getName());
        System.out.println(obj.toGenericString());
        System.out.println(obj.toString());

    }
}

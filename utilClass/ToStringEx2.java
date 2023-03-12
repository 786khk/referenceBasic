package utilClass;

class Cards{
    String kind;
    int num;
    public Cards(String kind,int num){
        this.num = num;
        this.kind = kind;
    }
    public Cards(){
        this("SPADE",1);
    }
    public String toString(){
        return "kind : "+kind + ", number: "+ num;
    }
}

public class ToStringEx2 {
    public static void main(String[] args) {
        Cards c1 = new Cards();        
        Cards c2 = new Cards("HEART",10);      
          
        System.out.println(c1.toString());//kind : SPADE, number: 1
        System.out.println(c2.toString());// kind : HEART, number: 10

    }
    
}

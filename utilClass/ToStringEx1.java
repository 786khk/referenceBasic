package utilClass;

class Card{
    String kind;
    int num;
    public Card(String kind,int num){
        this.num = num;
        this.kind = kind;
    }
    public Card(){
        this("SPADE",1);
    }
}
public class ToStringEx1 {
    public static void main(String[] args) {
        Card c1 = new Card();        
        Card c2 = new Card();        
        System.out.println(c1);//utilClass.Card@372f7a8d
        System.out.println(c2);//utilClass.Card@2f92e0f4
        System.out.println(c1.toString());//utilClass.Card@372f7a8d
        System.out.println(c2.toString());//utilClass.Card@2f92e0f4
        /**
            Object.toString()을 오버라이딩 하지 않았기때문에 클래스 이름.@해시코드값으로 출력
         * 
         */
    }
    
}

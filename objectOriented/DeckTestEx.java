package objectOriented;

public class DeckTestEx {
    public static void main() {
        Deck d = new Deck();
        CardDeck c = d.pick(0); //CardDeck의 pick 호출
        System.out.println(c);
        d.shuffle();
        c = d.pick(0);
        System.out.println(c); // Card의 toString() 호출됨

    }
}
class Deck{
    final int CARD_NUM=52; //카드 갯수
    CardDeck cardArray[] = new CardDeck[CARD_NUM]; // 

    Deck () {
        int i=0;
        for(int k=CardDeck.KIND_MAX; k>0 ; k--){
            for(int n = 0; n < CardDeck.NUM_MAX; n++){
            cardArray[i++] = new CardDeck(k,n+1);}
        }
    }
    CardDeck pick(int cardNo){

        return cardArray[cardNo]; 
        /**
         * cardNo가 0이라면
         cardArray[cardNo]; 
         -> return cardArray[0];
         -> return cardArray[0]의 주소값
         */
    }
    CardDeck pick(){
        int index =(int)( Math.random() * CARD_NUM);
        return pick(index);
    }
    void shuffle(){
        for(int k=0; k<cardArray.length ; k++){
            int r = (int)( Math.random() * CARD_NUM);

            CardDeck temp = cardArray[k];
            cardArray[k] = cardArray[r];
            cardArray[r] = temp;
        }
    }
}

class CardDeck{
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int HEART = 3;
    static final int DIAMOND = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    CardDeck(){
        this(SPADE,1);
    }
    CardDeck(int kind, int number){
        this.kind = kind;
        this.number = number;
    }
    //Object에서 정의됨
    public String toString(){ // 인스턴스의 정보를 문자열로 반환할 목적으로 생성됨

        String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers = "123456789XJQK";

        return "kind :"+kinds[this.kind]+", number : "+ numbers.charAt(this.number); 
    }
}
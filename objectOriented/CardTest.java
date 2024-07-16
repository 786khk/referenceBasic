package objectOriented;

public class CardTest{
    public void main(){
        // 클래스변수로 선언된 값은 생성자를 생성하지 않아도 이미 메모리에 올라가기때문에 출력 됨
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        // 인스턴스 번수 값 변경
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        
        System.out.println("c1 은" + c1.kind + ", "+c1.number + "이며 크기는 ("+c1.width +" X "+c1.height+")이다");
        System.out.println("c2 은" + c2.kind + ", "+c2.number + "이며 크기는 ("+c2.width +" X "+c2.height+")이다");
        System.out.printf("c1 크기 변경 width = %d, height = %d%n",50,150);
        // 클래스 변수 값 변경
        c1.width = 50; 
        c1.height = 150;
        System.out.println("c1 은" + c1.kind + ", "+c1.number + "이며 크기는 ("+c1.width +" X "+c1.height+")이다");
        System.out.println("c2 은" + c2.kind + ", "+c2.number + "이며 크기는 ("+c2.width +" X "+c2.height+")이다");
        // 인스턴스에 있는 클래스 변수지만 하나의 메모리를 공유하기 때문에 크기가 같이 변경 됨
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
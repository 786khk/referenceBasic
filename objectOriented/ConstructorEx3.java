package objectOriented;


public class ConstructorEx3 {
  
    public void main(){
        CarConstructor_ c = new CarConstructor_();
        c.color = "red";
        c.gearType = "auto";
        c.door = 5;
        CarConstructor_ c2 = new CarConstructor_("blue","auto",4);

        System.out.println("c.color: " + c.color + "c.gearType: " + c.gearType+ "c.door: " + c.door);
        System.out.println("c2.color: " + c.color + "c2.gearType: " + c.gearType+ "c2.door: " + c.door);
    }
        


}


class CarConstructor_{
    String color;
    String gearType;
    int door;

    CarConstructor_(){
        // 유기적 연결
        this("white","auto",3);
    }

    CarConstructor_(String color){
        this(color,"auto",3);
    }
   /* CarConstructor_(String c, String g, int n){
        // 아래 생성자와 같지만 지역변수로 간주될 수 있음 컴파일러는 명확한걸좋아함 변태같음
        color = c;
        gearType = g;
        door = n;
    }*/
    CarConstructor_(String color, String gearType) {
        // 도어 수를 기본값으로 설정하는 생성자를 호출
        this(color, gearType, 4);
    }
    CarConstructor_(int door) {
        // 도어 수를 기본값으로 설정하는 생성자를 호출
        this("yellow", "m", door);
    }

    CarConstructor_(String c, String g, int n){
        // this 키워드로 인스턴스 변수와 지역변수구분
        this.color = c;
        this.gearType = g;
        this.door = n;
        // 인스턴스 변수만 this사용가능, this는 현재 객체를 가리킴
        
    }
}
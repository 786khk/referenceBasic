package objectOriented;


public class ConstructorEx4 {
  
    public void main(){
        CarConstructor_2 c = new CarConstructor_2();

        CarConstructor_2 c2 = new CarConstructor_2(c);

        System.out.println("c.color: " + c.color + "c.gearType: " + c.gearType+ "c.door: " + c.door);
        System.out.println("c2.color: " +c2.color + "c2.gearType: " + c2.gearType+ "c2.door: " + c2.door);
        
        c.door = 100;
        System.out.println("c의 문 수 변경");
        System.out.println("c.color: " + c.color + "c.gearType: " + c.gearType+ "c.door: " + c.door);
        System.out.println("c2.color: " + c2.color + "c2.gearType: " + c2.gearType+ "c2.door: " + c2.door);
        //c를 변경해도 이미c2는 독립적인 객체이기때문에  c2는변경 안됨
    }
        


}


class CarConstructor_2{
    String color;
    String gearType;
    int door;

    CarConstructor_2(){
        // 유기적 연결
        this("white","auto",3);
    }

    CarConstructor_2(CarConstructor_2 c){
        // 인스턴스 복사를 위한 생성자
        color = c.color;
        gearType =c.gearType;
        door = c.door;
    }

    CarConstructor_2(String c, String g, int n){
        // this 키워드로 인스턴스 변수와 지역변수구분
        this.color = c;
        this.gearType = g;
        this.door = n;
        // 인스턴스 변수만 this사용가능, this는 현재 객체를 가리킴
        
    }
}

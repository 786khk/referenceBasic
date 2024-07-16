package objectOriented;

class Data1{
    int value;
}
class Data2{
    int value;

    Data2(int x){ //매개변수 있는 생성자
        value = x;
    }
}
public class ConstructorEx {
    Data1 d1 = new Data1(); // 인스턴스 생성
    // 기본으로 제공하는 기본생성자, 클래스 내 생성자사 하나도 없을경우 컴파일러가 자동 추가함
    // 생성자 : 인스턴스를 생성할 때 호출되는 인스턴스 초기화 메서드
    // new 에 의해 메모리에 인스턴스 할당 생성된 인스턴스주소 반환돼 참조변수에 저장
    // 생성자 Data1() 호출됨
    Data2 d2 = new Data2(2);
    // Data2 d2 = new Data2(); // 생성자를 찾을 수 없다는 compiler error 

  


}
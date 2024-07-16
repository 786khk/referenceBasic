package objectOriented;

public class PrimitiveParamEx {
    public void main(){
        Data d = new Data();
        d.x = 10;
        System.out.println("before called change() : x = " + d.x);
        change(d.x); // d.x가 chage메서드의 매개변수 x에 복사
        System.out.println("after called change() : x = " + d.x);
        System.out.println("main Data.x = " + d.x); // change메서드가 콜스택에서 제거됐기때문에 기존에 있던 값 10으로 출력됨
        return; // void 함수는 컴파일러가 알아서 추가해줌
    }
    static void change(int x){
        x=100;
        System.out.println("change() : x = " + x);
    }


}
class Data{
    int x;
}
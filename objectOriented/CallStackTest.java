package objectOriented;

public class CallStackTest {
    public void main(){
        first();
    }
    static void first(){ 
        /*static키워드를 붙인 메서드, 변수는 현재 클래스의 정보가 메서드영역에 할당되면 클래스 변수, 메서드가 메모리에 할당되기때문에 따로
         객체를 생성하지 않고 메서드 호출시 static 키워드가 있어야 가능 */
        second();
    }
    static void second(){
        System.out.println("call mathod second");
    }
}

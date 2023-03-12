package utilClass;

public class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        // 두개의 인스턴스가 생성되고 나서 서로 같은 클래스인지 비교
        if(v1.equals(v2))// 주소값으로 비교
            System.out.println("v1==v2"); 
        else 
            System.out.println("v1!=v2");// 참조하는 주소값이 다르기때문에 결과는 v1!=v2
            
        v2 = v1; //v1의 주소값을 v2에 대입 즉 v1과 v2는 같은 주소값 참조

        if(v1.equals(v2))System.out.println("v1==v2");
        else System.out.println("v1!=v2");

    }
}
class Value{
    int value;
    public Value(int value){
        this.value = value;
    }
}

package objectOriented;

public class ReferenceParamEx {
    public void main(){
        Data d = new Data();
        d.x = 10;
        System.out.println("before called change() : x = " + d.x);
        change(d); // 기본형이 아니라 값이 저장된 주소가 복사됨. 값 읽기, 변경 가능
        System.out.println("after called change() : x = " + d.x);
        System.out.println("main Data.x = " + d.x); 
    }
    static void change(Data d){
        d.x=100;
        System.out.println("change() : x = " + d.x);
    }


}
class Data{
    int x;
}
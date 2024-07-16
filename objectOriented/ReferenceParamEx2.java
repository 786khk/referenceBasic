package objectOriented;

public class ReferenceParamEx2 {
    public void main(){
        int[]  x = {10};
        System.out.println("before called change() : x[0] = " + x[0]);
        change(x); // 기본형이 아니라 값이 저장된 주소가 복사됨. 값 읽기, 변경 가능
        System.out.println("after called change() : x[0] = " + x[0]);
        System.out.println("main x[0] = " +  x[0]); 
    }
    static void change(int[] x){
        x[0]=100;
        System.out.println("change() : x[0] = " + x[0]);
    }


}

package objectOriented;

public class CallStackTest2 {
    public void main(){
        System.out.println("main 시작");
        first();
        System.out.println("main 끝");
    }
    static void first(){ 
        System.out.println("first 메서드 시작");
        second(); // second 메서드가 마칠때까지 first함수 내 로직 일시중지
        System.out.println("first 메서드 끝");
    }
    static void second(){
        System.out.println("second 시작");
        System.out.println("second 메서드 끝");
    }
}

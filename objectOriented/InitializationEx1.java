package objectOriented;

public class InitializationEx1 {
    static{// 클래스 멤버 초기화
        System.out.println("static {}");
    }
    { // 인스턴스 멤버 초기화
        System.out.println("instance {}");
    }
    public InitializationEx1() {
        System.out.println("생성자");
    }

    public void main(){
        System.out.println("InitializationEx1 iz = new InitializationEx1()");
        InitializationEx1 iz = new InitializationEx1();
        System.out.println("InitializationEx1 iz2 = new InitializationEx1()");
        InitializationEx1 iz2 = new InitializationEx1();
        
    }

    /*
     * 
    static {}
    instance {}
    생성자
    InitializationEx1 iz = new InitializationEx1()
    instance {}
    생성자
    InitializationEx1 iz2 = new InitializationEx1()
    instance {}
    생성자
     */
}

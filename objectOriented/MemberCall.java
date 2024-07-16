package objectOriented;

public class MemberCall{
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv2; //클래스 변수는 인스턴스 변수 사용못함
    // 인스턴스 맴버가 존재하는 시점에 클래스 맴버는 항상 존재하지만 클래스 멤버가 존재하는 시점에 인스턴스 맴버는 존재하지 않을 가능성이있어 사용불가
    static int cv2 = new MemberCall().iv; 

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv);// 클래스 메서드에서 인스턴스변수는 사용불가
        MemberCall mc = new MemberCall();
        System.out.println(mc.iv);
    }

    void instanceMethod() { 
        System.out.println(cv);
        System.out.println(iv);
    }
    static void staticMethod2(){
        staticMethod1();
        // instanceMethod();//인스턴스 메서드는 믈래스 메서드 내 사용불가
        MemberCall c = new MemberCall();
        c.instanceMethod(); // 인스턴스가 이미 생성돼 인스턴스를 생성한 후 인스턴스 메서드 사용가능
        // 다른 인스턴스 맴버도 객체생성으로 인스턴 스 내 존재함
    }

    void instanceMethod2() { //인스턴스 메서드 내 인스턴스 메서드, 클래스 메서드 사용 모두 가능
        staticMethod1();
        instanceMethod();
    }

}
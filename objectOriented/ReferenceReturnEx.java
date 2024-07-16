package objectOriented;

public class ReferenceReturnEx {
    public void main(){ // 20. 실행순서 2번째 call stack에 가장 나중에 실행됨
        ReturnData d = new ReturnData(); //08. 새 객체 생성 힙메모리에 주소값이 저장됨
        d.x = 100000; // 09. 힙에 일치하는 주소값에 대입된 값 저장
        ReturnData r = copy(d); //10. 실행순서 1번째 
        System.out.println("d.x = " + d.x);
        System.out.println("r.x = " + r.x);
    }

    static ReturnData copy(ReturnData data){
        ReturnData tmp = new ReturnData(); //11. 새 객체 생성
        tmp.x =data.x; // 12. d.x값을 tmp.x에 복사 

        return tmp; // 13. 파라미터로 넘겨받은 객체에 저장된 값을 복사해 반환
    }
}

class ReturnData{
    int x;
}

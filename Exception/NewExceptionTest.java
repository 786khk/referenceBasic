package Exception;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            coptFiles();
        } catch (SpaceException se) {
            System.out.println("에러"+se.getMessage());
            se.printStackTrace();
            System.out.println("설치할 공간 확보요망");
            // TODO: handle exception
        } catch (MemoryException me) {
            System.out.println("에러"+me.getMessage());
            me.printStackTrace();
            System.out.println("다시 설치 시도요망");
        }finally{
            deleteTempFiles();
        }  
    }

    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()) throw new SpaceException("설치공간 부족");
        if(!enoughMemory()) throw new MemoryException("메모리 부족");

    }
    static void coptFiles(){System.out.println("설치파일 복사!");};
    static void deleteTempFiles(){System.out.println("설치파일 삭제!");};
    static boolean enoughSpace(){return false;}

    static boolean enoughMemory(){ return true;}
    
}
class SpaceException extends Exception{ //Exception을 상속받는건 checked예외로 강제적인 예외
    SpaceException(String msg){super(msg);}
}
class MemoryException extends Exception{
    MemoryException(String msg){super(msg);  }
}

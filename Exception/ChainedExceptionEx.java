package Exception;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try{
            install();
        }catch(InstallException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static void install() throws InstallException{
        try{
            startInstall();
            coptFiles();
        }catch(SpaceException e){
            InstallException ie = new InstallException("설치중 예외");
            ie.initCause(e);
            throw ie;

        }catch(MemoryException me){
            InstallException ie = new InstallException("설치중 예외");
            ie.initCause(me);
            throw ie;
        }finally{
            deleteTempFiles();
        }
    }


    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()) throw new SpaceException("설치공간 부족");
        if(!enoughMemory()){
            throw new MemoryException("메모리 부족");
            // throw new RuntimeException(new MemoryException("RuntimeException 메모리 부족"));
        } 

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

class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}

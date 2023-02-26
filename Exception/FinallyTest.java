package Exception;

public class FinallyTest {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFile();
            deleteTempFiles();

        }catch(Exception e){
            e.printStackTrace();
            deleteTempFiles();//try 블록 실행여부와 상관없이 실행되어야 하는 메서드
        }

    }

    static void startInstall(){
        // 프로그램 설치에 필요한 코드를 적는다.
    }
    static void copyFile(){
        //파일을 복사하는 코드
    }
    static void deleteTempFiles(){
        // 임시파일을 삭제하는 코드
    }
}

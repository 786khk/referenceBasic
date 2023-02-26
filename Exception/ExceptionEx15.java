package Exception;

import java.io.File;

public class ExceptionEx15 {
   
    public static void main(String[] args) throws Exception {
        File file = createFile("");
        System.out.println(file.getName() +"파일이 성공적으로 생성되었습니다." );
    }

    static File createFile(String fileName) throws Exception{
        try {
            if(fileName.equals(null) || fileName.equals("")) throw new Exception("파일이름이 유효하지 않습니다.");           
            
        } catch (Exception e) {
            fileName = "제목 없음.txt";
        }finally{ // 예외 발생 여부에 상관없이 파일생성
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f){
        try {
            f.createNewFile();
        } catch (Exception e) {}

    }

}

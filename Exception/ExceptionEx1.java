package Exception;

public class ExceptionEx1 {
    //try~catch 구조
    public static void main(String[] args) {
        try{
            try {} catch (Exception e1) {}
        } catch(Exception e){
            // try {} catch (Exception e) {}변수이름 e가 중복돼서 에러 
            try {} catch (Exception e1) {}
        }

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

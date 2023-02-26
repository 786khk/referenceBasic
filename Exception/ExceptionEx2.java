package Exception;

public class ExceptionEx2 {
    //try~catch 구조
    public static void main(String[] args) {
        try{
            try {} catch (Exception e1) {}
        } catch(Exception e){
            try {} catch (Exception e2) {}
        }

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

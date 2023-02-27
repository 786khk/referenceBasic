package Exception;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try(CloseableResource cr = new CloseableResource()) {
           cr.exceptionWork(false); //close()만 예외
        
        } catch (WorkException e) {
            e.printStackTrace();
        } catch(CloseException e ){
            e.printStackTrace();
        }

        try(CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true); //close()와 exceptionWork() 둘 다 예외 발생
            
         
         } catch (WorkException e) {
             e.printStackTrace();
         } catch(CloseException e ){
             e.printStackTrace();
         }

    }

    static void mathod1(){
        try {
            System.out.println("method1 호출됨");
            return ;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("method1 finally 블럭 실행");
        }
    }
  
}
class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("excetion Work("+ exception +")가 호출됨");
        if(exception) throw new WorkException("WorkException 발생!");
    }
    public void close() throws CloseException{
        System.out.println("close() 호출");
        throw new CloseException("CloseException 발생");
    }
}

class WorkException extends Exception{
    WorkException(String message){super(message);}
}

class CloseException extends Exception{
    CloseException(String message){super(message);}
}

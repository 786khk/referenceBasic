package Exception;

public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.mathod1();
        System.out.println("FinallyTest3.mathod1() 실행을 마치고 main으로 돌아옴");

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

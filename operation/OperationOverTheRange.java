package operation;

public class OperationOverTheRange {
    
    public static int addNomal(int base, int addThis){
        return base + addThis;
    }

    public static int addSafety(int base, int addThis){
        if((Integer.MAX_VALUE - addThis)>base){
            return base + addThis;
        }else{
            throw new ArithmeticException("오버플로우 발생!!!!!!");
        }
    }
    public static void main(String[] args) {
        int result = addNomal(Integer.MAX_VALUE, 1);
        System.out.println("일반 덧셈 결과" + result);

        try {
            result = addSafety(100, 100);
            System.out.println("안전한 덧셈 결과" + result);
            result = addSafety(Integer.MAX_VALUE, 100);
            System.out.println("안전한 덧셈 결과2" + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

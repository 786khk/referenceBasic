package objectOriented;

public class VaraggsTestEx {
    public static void main() {
        String[] strArr = {"kim","lee","park"};
        System.out.println(concatenate("","kim","lee","park"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",",new String[]{"kim","lee","park"})); // 배열을 명시적으로 생성해 매개변수전달
        System.out.println("["+concatenate(",","kim","lee","park")+"]");
        System.out.println("["+concatenate(",",new String[0])+"]");
        System.out.println("["+concatenate(",","")+"]");
        // System.out.println(concatenate(",",{"kim","lee","park"}));
        // 가변인자 전달시 배열리터럴을 바로 전달할 수 없기때문에 개별 인수를 전달하거나 배열을 명시적으로 객체로 생성한 후 전달해야함
    }
    static String concatenate(String delim, String ...args){ // 타입 ...변수명 으로 선언 
        // 내부적 배열 이용, 가변인자로 선언되면 메서드 호출시 컴파일러가 새로운 배열객체 생성 해줌
        // 배열로 선언하게 되면 `타입[]` 과 같이 매개변수 타입을 선언해야하기때문에 인자를 생랼할 수 없다.
        // 반드시 인자를 null이거나 0인 배열을 인자로 지정해줘야하는 불편함 
        String result = "";
        
        for(String str : args){
            result += str+ delim;
        }
        return result;
    }

    // static String concatenate(String delim, String ...args){
    //     return concatenate(delim, args);
    // }
}

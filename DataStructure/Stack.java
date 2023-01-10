package DataStructure;

public class Stack{
    
    // 데이터를 담을 배열
    // 데이터를 넣을 배열의 인덱스
    public static int pushIndex = 0;
    public static int[] stack = new int[3];
    //처음 들어온 데이터가 가장 늦게 나간다.

    //데이터가 순서대로 쌓인다.
    public static void push(int value){
        stack[pushIndex] = value;
        ++pushIndex;
    
    }

    public static void pop(){
        // 가장 마지막에 들어온 데이터가 가장 빨리 나간다.
        int popIndex = stack.length;
        stack[popIndex]=0;
        --popIndex;

    }
  
    public static void main(String[] args) {
            for(int i=1; i<=10; i++){
                push(i);
                
                if (pushIndex == stack.length) {
                    break;
                }
            }

  
    }
}
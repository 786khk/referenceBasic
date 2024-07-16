package objectOriented;

public class InitializationEx2 {
    static int[] intArr = new int[10];
    static {
        // 클래스 맴버 초기화
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = (int) (Math.random()*10)+1;
        }
    }

    public void main(){
      for(int i=0; i<intArr.length; i++) {
        System.out.println("intArr["+i+"] : " + intArr[i]);
      }
    }

    /*
        intArr[0] : 6
        intArr[1] : 3
        intArr[2] : 4
        intArr[3] : 1
        intArr[4] : 1
        intArr[5] : 6
        intArr[6] : 4
        intArr[7] : 10
        intArr[8] : 1
        intArr[9] : 4
     */
}

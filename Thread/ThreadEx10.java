package Thread;

public class ThreadEx10 implements Runnable{
    static boolean autoSave = false;
    public void main(){
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true); // 없으면 종료가 안됨, start전에 호출
        t.start();

        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {}
            System.out.println(i);
            if(i==5){
                autoSave = true;
            }
        }
        System.out.println("종료");
    
    }

    public void run(){// runnable인터페이스 오버라이딩
        while(true){
            try {
                Thread.sleep(3*1000);
                
            } catch (InterruptedException e) {
               
            }
            if(autoSave) {
                autoSave();
            }
        }
    }
    public void autoSave(){
        System.out.println("작업파일 자동저장");
    }



    /*
     
    1
    2
    3
    4
    5
    작업파일 자동저장
    6
    7
    8
    작업파일 자동저장
    9
    10
    종료
     */
}

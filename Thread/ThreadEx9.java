package Thread;

public class ThreadEx9 {
    public static void main() {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup group1 = new ThreadGroup("group1");
        ThreadGroup group2 = new ThreadGroup("group2") ;

        ThreadGroup subGroup1 = new ThreadGroup(group1, "subGroup1");
        group1.setMaxPriority(3);


        Runnable r = new Runnable() {
            public void run(){
                try {
                    Thread.sleep(1000); // 출력 전에 정지될 수 있으므로 잠깐 멈춤
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        };

        new Thread(group1,r,"t1").start();;
        new Thread(subGroup1,r,"t2").start();
        new Thread(group2,r,"t3").start();
        System.out.println(">>LIST of ThreadGroup : " + main.getName() + ", active Thread Group : " + main.activeGroupCount()+", Active Thread : " + main.activeCount());
        /**
         * 
        >>LIST of ThreadGroup : main, active Thread Group : 3, Active Thread : 4
        java.lang.ThreadGroup[name=main,maxpri=10]
            Thread[main,5,main]
            java.lang.ThreadGroup[name=group1,maxpri=3]
                Thread[t1,3,group1]
                java.lang.ThreadGroup[name=subGroup1,maxpri=3]
                    Thread[t2,3,subGroup1]
            java.lang.ThreadGroup[name=group2,maxpri=10]
                Thread[t3,5,group2]
         */

         
        main.list();

    
    }
}

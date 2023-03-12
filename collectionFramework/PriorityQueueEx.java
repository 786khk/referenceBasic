package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();

        queue.offer(3); // 자동으로 오토박싱
        queue.offer(2);
        queue.offer(1);
        queue.offer(5);
        queue.offer(4);

        System.out.println(queue);//[1, 3, 2, 5, 4] 순서가 다른데 우선순위는 숫자가 다를수록 먼저
        Object obj = null;
        while ( (obj=queue.poll())!= null){
            System.out.println(obj);
            /**
                1
                2
                3
                4
                5
             */
            // 힙의형태로 출력 
        }
    }
}

package format;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) throws Exception{
        // DecimalFormatEx1 ex1 = new DecimalFormatEx1();
        // ex1.main();

        // DecimalFormatEx2 ex2 = new DecimalFormatEx2();
        // ex2.main();

        // DateFormaterEx1 dateEx1 = new DateFormaterEx1();
        // dateEx1.main();

        // DateFormaterEx2 dateEx2 = new DateFormaterEx2();
        // dateEx2.main();
        // DateFormaterEx3 dateEx3 = new DateFormaterEx3();
        // dateEx3.main();


        // DateFormaterEx4 dateEx4 = new DateFormaterEx4();
        // dateEx4.main();
        // ChoiceFormatEx1 choiceEx1 =  new ChoiceFormatEx1();
        // choiceEx1.main();
        
        // ChoiceFormatEx2 choiceEx2 = new ChoiceFormatEx2();
        // choiceEx2.main();
        // MessageFormatEx1 messageEx1 = new MessageFormatEx1();
        // messageEx1.main();
        // MessageFormatEx2 messageEx2 = new  MessageFormatEx2();
        // messageEx2.main();

        // MessageFormatEx3 messageEx3 = new  MessageFormatEx3();
        // messageEx3.main();
        // MessageFormatEx4 messageEx4 = new  MessageFormatEx4();
        // messageEx4.main();

        Solution test = new Solution();
        int[] t = {4, 2, 6, 1, 7, 6};
        int count = 2;
        test.solution(t, count);
    

    }


}

// class Solution {
//     public int[] solution(int n, int k) {
//         int[] answer = createArrayByMultipleValue(n,k);
//         return answer;
//     }
    
//     public int[] createArrayByMultipleValue(int n, int k){
        
//         int length = (int)(n/k);
//         int[] result = new int[length];
//         int index = 0;
//         for(int i=0; i<n; i++){
//             if(i>0 && (k*i)<=n){
//                 result[index]=(k*i);
//                 if(index == result.length) break;
//             }
//             index++;
//         }
        
//         return result;
//     }
// }


class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = getArrayByIndex(n,num_list);
        return answer;
    }
    
    public int[] getArrayByIndex(int n,int ...num_list ){
        int[] result = new int[num_list.length/n];
        int index = 0;
        for(int i=0; i< result.length;i++){
            result[index] =num_list[n*i];
            index++;

        }

        return result;
    }
}
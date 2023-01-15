package controlStatement;

public class RepeatingSentenceFor {
    public static void main(String[] args) {
        // for (int i=1; i<9; i++){
        //     for(int j=1;j<9; j++){
                
        //         System.out.println(i +"X"+j+"="+(i*j));

        //     }
        // }
            int sum=0;
            for(int i=0; i<1000; i++){
                if(i%3>0){
                    continue;
                }
                sum+=i;
            }
            System.out.println(sum);
        // for(int i=0; i<5; i++){
        //     for(int j=0; j<5 && j<=i;j++){

        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// *
// **
// ***
// ****
// *****

        // for (int i = 5; i>=0; i--) {
        //     for (int j = 0; j < i; j++) {

        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// *****
// ****
// ***
// **
// *

        // for (int i = 5; i>=0; i--) {
        //     for (int j = 0; j!=0&&j<i ; j++) {

        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

      


    }
}

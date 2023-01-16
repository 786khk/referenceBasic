package Array;

public class ArraySimple{
    public static void main(String[] args) {
        int point[] = new int[3];

        point[0] = 5;
        point[1] = 10;
        System.out.println(point[0]);
        System.out.println(point[1]);
        System.out.println(point[2]);

        for(int i=0;i<point.length;i++){
            
            point[i] = i*3;
            
        }
        int sum = 0;
        for (int i = 0; i < point.length; i++) {

            sum += point[i];

        }
        System.out.println(sum);

        for(int j=0; j<=4; j++){
            System.out.printf("%d번째 요소 : %d", j, point[j]);
        }

    }
}
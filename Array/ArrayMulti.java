package Array;

public class ArrayMulti {
    public static void main(String[] args) {
        int arr1[][] = new int[2][3];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[0][2]=3;
        arr1[1][0]=11;
        arr1[1][1]=12;
        arr1[1][2]=13;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("2차원 배열인자 : "+arr1[i][j]);
            }
        }

        int[][] arr = new int[2][];
        arr[0] = new int[]{100,200,300};
        arr[1] = new int[2];
        // arr[0] = new int[3];
        // arr[0][0] = 100;
        // arr[0][1] = 200;
        // arr[0][2] = 300;
        arr[1][0] = 222;
        arr[1][1] = 111;

        for(int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.println("가변배열 인자 : " +arr[i][j]);
            }
        }

        //다차원 배열의 초기화
        char[][] mynam={
                    {'K','I','M'},
                    {'H','Y','U','N'},
                    {'K','Y','U','N','G'}
                };

                for(int i=0; i<mynam.length;i++){
                    for(int j=0; j< mynam[i].length;j++){
                        System.out.print(mynam[i][j]);
                    };
                    System.out.println();
                };
    }
}

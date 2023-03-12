package utilClass;

import java.util.Arrays;
public class CloneEx2 {
    public static void main(String[] args) {
       
        int arr[] ={1,2,3,4,5};
        int clone[] = arr.clone(); //public으로 오버라이딩, 원본과 같은 타입으로 구현하기때문에 형변환이 없어도 됨
        clone[0] = 6;

        System.out.println(Arrays.toString(arr));//[0, 2, 3, 4, 5]
        System.out.println(Arrays.toString(clone));//[6, 2, 3, 4, 5]

    }
    
}


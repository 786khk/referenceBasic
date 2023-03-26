package format;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main() {
        String message = "Name : {0} \nTel: {1} \n Age:{2} \n Birthday:{3}";
        Object[] argument={"김현경","010","32","09-15"};
        // Object[] argument={"김현경",010,32,"09-15"};
        String result = MessageFormat.format(message, argument);
        System.out.println(result);
           /*
         결과 : 
        Name : 김현경 
        Tel: 010
        Age:32
        Birthday:09-15
         */
    }
}

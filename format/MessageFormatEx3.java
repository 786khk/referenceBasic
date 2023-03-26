package format;

import java.text.MessageFormat;
import java.text.ParseException;


public class MessageFormatEx3 {
    public static void main() throws ParseException {
        String []message = {"INSERT INTO tb_user VALUES ('김현경','010',23,'09-15') ;",
        "INSERT INTO tb_user VALUES ('김현경','010',23,'09-15') ;"};
        // Object[] argument={"김현경",010,32,"09-15"};
        
        String pattern = "INSERT INTO tb_user VALUES ({0},{1},{2},{3}) ;";
        MessageFormat messageFormat = new MessageFormat(pattern);
        
        for(int i=0; i<message.length; i++){
            Object[] obj = messageFormat.parse(message[i]);
            for(int j=0;j< obj.length; j++){
                System.out.print(obj[j]);
            }
            System.out.println();
        }
           /*
         결과 : 
        '김현경''010''23''09-15'
        '김현경''010''23''09-15'
         */
    }
}

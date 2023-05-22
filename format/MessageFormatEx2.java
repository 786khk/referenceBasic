package format;

import java.text.MessageFormat;
import java.util.Arrays;

public class MessageFormatEx2 {
    public static void main() {
        String table = "tb_user";
        String message = "INSERT INTO"+table+" VALUES (''{0}'',''{1}'',{2},''{3}'') ";
        Object[][] argument={{"김현경","010",23,"09-15"},{"박철오","010",25,"03-03"}};
        // Object[] argument={"김현경",010,32,"09-15"};
        for(int i=0; i<argument.length; i++){

            String result = MessageFormat.format(message, argument[i]);
            System.out.println(result);
        }
        Arrays.sort(argument, 0, 0);
           /*
         결과 : 
        INSERT INTO tb_user+ VALUES ('김현경','010',23,'09-15') 
        INSERT INTO tb_user+ VALUES ('박철오','010',25,'03-03') 
         */
    }
}

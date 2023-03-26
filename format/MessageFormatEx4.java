package format;

import java.io.*;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Scanner;



public class MessageFormatEx4 {
    public static void main() throws FileNotFoundException, ParseException {
        String table = "tb_user";
        String fileName = "./data.txt";
        String message = "INSERT INTO "+table+" VALUES ({0},{1},{2},{3}) ;";
        Scanner s = new Scanner(new File(fileName));
        String pattern = "{0},{1},{2},{3} ;";
        MessageFormat messageFormat = new MessageFormat(pattern);
        while(s.hasNextLine()){
            String line = s.nextLine();
            Object[] obj = messageFormat.parse(line);
            System.out.println(MessageFormat.format(message, obj));
        }
        s.close();
           /*
         결과 : 
        '김현경''010''23''09-15'
        '김현경''010''23''09-15'
         */
    }
}

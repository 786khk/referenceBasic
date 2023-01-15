package controlStatement;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        String text ="";
        
        int value=0;

        switch (value){
            case 0: 
            // text += "0입니다.";
            text = "0입니다.";
            // break;
            case 1:
            // text += "1입니다.";
            text = "1입니다.";
            // break;
            default:
            // text += "defaul 입니다.";
            text = "defaul 입니다.";
            
        }

    System.out.println(text);
    }
}

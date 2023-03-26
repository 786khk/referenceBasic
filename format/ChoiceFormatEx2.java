package format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
    public static void main() {
        String pattern = "60#D|70#C|80#B|90#A";

        int[] scores = {100,95,67,45,55,85};
        ChoiceFormat choice = new ChoiceFormat(pattern);

        for(int i=0; i<scores.length; i++)
        System.out.println(scores[i] + ":"+ choice.format(scores[i]));
    }
}
/*
 * 결과:
    100:A
    95:A
    67:D
    45:D
    55:D
    85:B
 */

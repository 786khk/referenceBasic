package format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main() {
        double[] limit = {60, 70, 80,90};
        String[] grades = {"D","C","B","A"};

        int[] scores = {100,95,67,45,55,85};
        ChoiceFormat choice = new ChoiceFormat(limit, grades);

        for(int i=0; i<scores.length; i++)
        System.out.println(scores[i] + ":"+ choice.format(scores[i]));
    }
}

public class ToFloat {
    public static void main(String[] args) {
        String target = "116.13";
        toFloat(target);
    }

    static void toFloat(String param){
        if(param.contains("-")) param = param.substring(param.lastIndexOf("-")+1);
        // float paramFloat = Float.parseFloat(param);
        // int former = (int)paramFloat;
        float endFloat = Float.parseFloat("0." + param.substring(param.lastIndexOf(".") + 1));

        String resultFomer = getIntegerBinary(param);
        String resultEnd = getFloatBinary(endFloat);
        System.out.println(resultFomer+resultEnd);
        // while(true){
        //     resultFomer += (former>1)?String.valueOf(former % 2):String.valueOf(former);
        //     former = former/2;
        //        if(former<1){
        //             break;
        //         }
        // }
        // String floatResult = "";
        // while(true){
        //     endFloat = endFloat*2;
        //     String floatToString = String.valueOf(endFloat);
        //     int boundary = floatToString.lastIndexOf(".");
        //     // System.out.println("toString : "+ floatToString);
        //     // System.out.println("cuttongPoint"+ cuttongPoint);
        //     // System.out.println(floatToString.substring(0, cuttongPoint));
        //     floatResult += floatToString.substring(0, boundary);
        //     if(endFloat>=1.0){
        //         break;
        //     }
        // }
        // String result = new StringBuffer(resultFomer).reverse().toString();
        // System.out.println("result : "+ result);
    }
    static String getIntegerBinary(String param){
        if (param.contains("-")) param = param.substring(param.lastIndexOf("-") + 1);
        float paramFloat = Float.parseFloat(param);
        int former = (int) paramFloat;

        String resultFomer = "";
        while (true) {
            resultFomer += (former > 1) ? String.valueOf(former % 2) : String.valueOf(former);
            former = former / 2;
            if (former < 1) {
                break;
            }
        }
        String result = new StringBuffer(resultFomer).reverse().toString();
        return result;
    }
    static String getFloatBinary(float endFloat){
        String floatResult = "";

        while (true) {
            endFloat = endFloat * 2;
            String floatToString = String.valueOf(endFloat);
            int border = floatToString.lastIndexOf(".");
            // System.out.println("toString : "+ floatToString);
            // System.out.println("cuttongPoint"+ cuttongPoint);
            // System.out.println(floatToString.substring(0, cuttongPoint));
            floatResult += floatToString.substring(0, border);
            if (endFloat >= 1.0) {
                break;
            }
        }
        // String result = new StringBuffer(resultFomer).reverse().toString();
        // System.out.println("result : "+ result);
        return floatResult;
    }
}

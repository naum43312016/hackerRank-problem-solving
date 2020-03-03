package asafov.com.TimeConversio;

import java.util.Arrays;

public class Main {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] arr = s.split(":");
        StringBuilder stringBuilder = new StringBuilder();
        if (arr[2].contains("P")){
            int t = Integer.valueOf(arr[0]);
            t+=12;
            String h = ""+t;
            if (t>23){
                h = "00";
            }
            if(Integer.valueOf(arr[0])==12){
                h = "12";
            }
            stringBuilder.append(h);
            stringBuilder.append(":");
            stringBuilder.append(arr[1]);
            stringBuilder.append(":");
            stringBuilder.append(arr[2].charAt(0));
            stringBuilder.append(arr[2].charAt(1));
        }else{
            int t = Integer.valueOf(arr[0]);
            if (t>11){
                stringBuilder.append("00");
            }else{
                stringBuilder.append(arr[0]);
            }
            stringBuilder.append(":");
            stringBuilder.append(arr[1]);
            stringBuilder.append(":");
            stringBuilder.append(arr[2].charAt(0));
            stringBuilder.append(arr[2].charAt(1));

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String time = "12:05:45PM";
        System.out.println(timeConversion(time));
    }
}

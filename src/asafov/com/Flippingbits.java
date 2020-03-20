package asafov.com;

public class Flippingbits {

    static String toBinary(long n){
        return String.format("%32s",Long.toBinaryString(n)).replaceAll(" ","0");
    }


    static long flippingBits(long n) {
        String s = toBinary(n);
        System.out.println(s);
        StringBuilder str = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='0'){
                str.append("1");
            }else{
                str.append("0");
            }
        }
        return Long.parseLong(str.toString(),2);
    }


    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647));
    }
}

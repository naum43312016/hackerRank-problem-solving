package asafov.com;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1>x2 && v1>v2){
            return "NO";
        }
        if (x2>x1 && v2>v1){
            return "NO";
        }


        /*if ((x1+v1)%(x2+v2)==0){
            return "YES";
        }
        if ((x2+v2)%(x1+v1)==0){
            return "YES";
        }*/



        return "NO";
    }

    public static void main(String[] args) {

    }
}

package asafov.com;

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int ans=0;
        for (int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            i++;
            while (i<s.length() && s.charAt(i)==curr){
                ans++;
                i++;
            }
            i--;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AABAAB"));
    }
}

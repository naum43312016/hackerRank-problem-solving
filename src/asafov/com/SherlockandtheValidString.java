package asafov.com;

import java.util.Arrays;

public class SherlockandtheValidString {

    static String isValid(String s) {
        char[] arr = s.toCharArray();
        int[] let = new int[26];
        for (int i=0;i<arr.length;i++){
            int indx = ((int)arr[i])-97;
            let[indx]=let[indx]+1;
        }

        Arrays.sort(let);
        System.out.println(Arrays.toString(let));
        int i = let.length-1;
        int val = let[i];
        if (let[i]==let[i-1]){
            val = let[i];
        }else{
            val = let[i-1];
        }
        boolean flag = false;
        if (val==0) return "YES";//empty string
        while (i>=0 && let[i]!=0){
            if (let[i]!=val){
                if (flag) return "NO";
                if (Math.abs(let[i]-val)>1 && let[i]!=1){
                    return "NO";
                }
                flag=true;
            }
            i--;
        }
        return "YES";
    }


    public static void main(String[] args) {
        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }
}

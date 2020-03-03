package asafov.com.grading;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        for (int i=0;i<grades.size();i++){
            int g = grades.get(i);
            if (g>=38){
                if (g%5!=0){
                    int j=2;
                    while(j>0){
                        g++;
                        if (g%5==0){
                            grades.set(i,g);
                        }
                        j--;
                    }
                }
            }
        }
        return grades;
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(73);
        l.add(67);
        l.add(38);
        l.add(33);
        List<Integer> list = gradingStudents(l);
        System.out.println(list.toString());
    }
}

package asafov.com;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int steps = 0;
        for (int i=q.length-1;i>=0;i--){
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) steps++;
        }

        System.out.println(steps);
    }
    public static void main(String[] args) {

    }
}

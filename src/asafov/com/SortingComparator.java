package asafov.com;

import java.util.Arrays;
import java.util.Comparator;

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.getScore()>b.getScore()){
            return -1;
        }else if(a.getScore()<b.getScore()){
            return 1;
        }else{
            return a.getName().compareTo(b.getName());
        }
    }
}

class Player{
    private int score;
    private String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortingComparator {
/*
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

 */
    public static void main(String[] args) {
        Player[] player = new Player[5];
        Checker checker = new Checker();
        player[0] = new Player("amy",100);
        player[1] = new Player("david",100);
        player[2] = new Player("heraldo",50);
        player[3] = new Player("aakansha",75);
        player[4] = new Player("aleksa",150);

        Arrays.sort(player,checker);
        System.out.println(Arrays.toString(player));
    }
}

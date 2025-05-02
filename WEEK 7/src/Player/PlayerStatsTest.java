package Player;

public class PlayerStatsTest {
    public static void main(String[] args) {
        FootballStats Arman = new FootballStats("Arman", 40, 400);
        CricketStats Ab = new CricketStats("AB", 60, 250);

        Arman.showFootballStats();
        Ab.showCricketStats();
    }
}



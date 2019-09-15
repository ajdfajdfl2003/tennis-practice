public class Tennis {

    private final String playerA;
    private final String playerB;
    private int playerAGameTimes = 0;

    public Tennis(String playerA, String playerB) {

        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String score() {
        if (this.playerAGameTimes == 1) {
            return "Fifteen Love";
        }
        if (this.playerAGameTimes == 2) {
            return "Thirty Love";
        }
        return "Love All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }
}

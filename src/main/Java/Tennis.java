public class Tennis {
    private int playerAGameTimes;

    public String score() {
        if (playerAGameTimes == 1) {
            return "Fifteen Love";
        }
        if (playerAGameTimes == 2) {
            return "Thirty Love";
        }
        return "Love All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }
}

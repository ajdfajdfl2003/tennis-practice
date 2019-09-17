public class Tennis {
    private int playerAGameTimes;

    public String score() {
        if (playerAGameTimes == 1) {
            return "Fifteen Love";
        }
        return "Love All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }
}

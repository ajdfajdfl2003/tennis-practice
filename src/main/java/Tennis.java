import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreLookup = new HashMap<>();

    static {
        scoreLookup.put(0, "Love");
        scoreLookup.put(1, "Fifteen");
        scoreLookup.put(2, "Thirty");
        scoreLookup.put(3, "Forty");
    }

    private final String playerA;
    private final String playerB;
    private int playerAGameTimes = 0;
    private int playerBGameTimes = 0;

    public Tennis(String playerA, String playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String score() {
        if (this.playerAGameTimes != this.playerBGameTimes) {
            if (this.playerAGameTimes > 3 || this.playerBGameTimes > 3) {
                if (Math.abs(this.playerAGameTimes - this.playerBGameTimes) == 1) {
                    return getAdvPlayer() + " Adv";
                }
                return getAdvPlayer() + " Win";
            }
            return getNormalScore();
        }
        if (isDeuce()) {
            return "Deuce";
        }
        return getSameScore();
    }

    private String getAdvPlayer() {
        return this.playerAGameTimes > this.playerBGameTimes ? this.playerA : this.playerB;
    }

    private String getNormalScore() {
        return scoreLookup.get(this.playerAGameTimes) + " " + scoreLookup.get(this.playerBGameTimes);
    }

    private boolean isDeuce() {
        return this.playerAGameTimes == 3;
    }

    private String getSameScore() {
        return scoreLookup.get(this.playerAGameTimes) + " All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }

    public void playerBHit() {
        this.playerBGameTimes++;
    }
}

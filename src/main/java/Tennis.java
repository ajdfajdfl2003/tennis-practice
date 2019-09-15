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
        if (isScoreDifferent()) {
            return isReadyForWin() ? getAdvStatusScore()
                    : getNormalScore();
        }
        if (isDeuce()) {
            return getDeuce();
        }
        return getSameScore();
    }

    private String getDeuce() {
        return "Deuce";
    }

    private String getAdvStatusScore() {
        return getAdvPlayer() + (isAdv() ? " Adv" : " Win");
    }

    private boolean isScoreDifferent() {
        return this.playerAGameTimes != this.playerBGameTimes;
    }

    private boolean isAdv() {
        return Math.abs(this.playerAGameTimes - this.playerBGameTimes) == 1;
    }

    private boolean isReadyForWin() {
        return this.playerAGameTimes > 3 || this.playerBGameTimes > 3;
    }

    private String getAdvPlayer() {
        return this.playerAGameTimes > this.playerBGameTimes ? this.playerA : this.playerB;
    }

    private String getNormalScore() {
        return scoreLookup.get(this.playerAGameTimes) + " " + scoreLookup.get(this.playerBGameTimes);
    }

    private boolean isDeuce() {
        return this.playerAGameTimes >= 3;
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

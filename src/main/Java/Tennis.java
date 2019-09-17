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

    private int playerAGameTimes = 0;
    private int playerBGameTimes = 0;
    private String firstPlayerName;
    private String secondPlayerName;

    public Tennis(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String score() {
        if (isScoreDifferent()) {
            return isReadyForWin() ? getAdvPlayer() + getAdvStatusScore()
                    : getNormalScore();
        }
        if (isDeuce()) {
            return "Deuce";
        }
        return getSameScore();
    }

    private boolean isScoreDifferent() {
        return playerAGameTimes != playerBGameTimes;
    }

    private boolean isReadyForWin() {
        return playerAGameTimes > 3 || playerBGameTimes > 3;
    }

    private String getAdvStatusScore() {
        return Math.abs(playerAGameTimes - playerBGameTimes) == 1 ? " Adv" : " Win";
    }

    private String getSameScore() {
        return scoreLookup.get(playerAGameTimes) + " All";
    }

    private boolean isDeuce() {
        return playerAGameTimes >= 3;
    }

    private String getNormalScore() {
        return scoreLookup.get(playerAGameTimes) + " " + scoreLookup.get(playerBGameTimes);
    }

    private String getAdvPlayer() {
        return playerAGameTimes > playerBGameTimes ? firstPlayerName : secondPlayerName;
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }

    public void playerBHit() {
        this.playerBGameTimes++;
    }
}

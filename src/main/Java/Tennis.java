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

    public Tennis(String firstPlayerName) {
        this.firstPlayerName = firstPlayerName;
    }

    public String score() {
        if (playerAGameTimes != playerBGameTimes) {
            if (playerAGameTimes > 3) {
                return firstPlayerName + " Adv";
            }
            return scoreLookup.get(playerAGameTimes) + " " + scoreLookup.get(playerBGameTimes);
        }
        if (playerAGameTimes >= 3) {
            return "Deuce";
        }
        return scoreLookup.get(playerAGameTimes) + " All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }

    public void playerBHit() {
        this.playerBGameTimes++;
    }
}

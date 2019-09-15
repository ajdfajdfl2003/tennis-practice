import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreLookup = new HashMap<>();

    static {
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
        if (this.playerAGameTimes > 0) {
            return scoreLookup.get(this.playerAGameTimes) + " Love";
        }
        if (this.playerBGameTimes > 0) {
            return "Love " + scoreLookup.get(this.playerBGameTimes);
        }
        return "Love All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }

    public void playerBHit() {
        this.playerBGameTimes++;
    }
}

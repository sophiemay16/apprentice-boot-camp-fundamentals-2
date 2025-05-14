package bowling;

public class Bowling {

    public int bowl(int[] rolls) {
        int score = 0;
        for (int i = 0; i < rolls.length - 1; i += 1) {
            boolean strike = false;
            if (rolls[i] == 10) {
                score += rolls[i] + rolls[i + 1] + rolls[i + 2];
                strike = true;
            } else {
                int frameTotal = rolls[i] + rolls[i + 1];
                score += frameTotal;
                if (frameTotal == 10) {
                    score += rolls[i + 2];
                }
            }
            if (!strike) {
                i += 1;
            }
        }
        return score;
    }
}

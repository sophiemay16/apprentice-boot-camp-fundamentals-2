package bowling;

public class Bowling {

    public int bowl(int[] rolls) {
        int score = 0;
        for (int i=0; i<rolls.length; i+=2) {
            int frameTotal = rolls[i] + rolls[i+1];
            score += frameTotal;
            if (frameTotal == 10) {
                score += rolls[i+2];
            }
        }
        return score;
    }
}

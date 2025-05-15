package bowling;

public class Bowling {

    public int bowl(int[] rolls) {
        int score = 0;
        int frame = 0;
        for (int i=0; i<rolls.length-1; i+=2) {
            frame += 1;
            int frameTotal = rolls[i] + rolls[i+1];
            if (rolls[i] == 10) {
                score += 10 + rolls[i+1] + rolls[i + 2];
                i = i - 1;
                if (frame == 10) {
                    break;
                }
            } else if (frameTotal == 10) {
                score += 10 + rolls[i+2];
            } else {
                score += frameTotal;
            }
        }
        return score;
    }
}

package bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    @Test
    public void scoreGutterGame() {
        // given
        Bowling bowling = new Bowling();
        int[] rolls = new int[]{0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};

        // when
        int actualScore = bowling.bowl(rolls);

        // then
        int expectedScore = 0;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void scoreGame() {
        // given
        Bowling bowling = new Bowling();
        int[] rolls = new int[]{1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};

        // when
        int actualScore = bowling.bowl(rolls);

        // then
        int expectedScore = 20;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void scoreGameWithSingleSpare() {
        // given
        Bowling bowling = new Bowling();
        int[] rolls = new int[]{5,5, 1,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};

        // when
        int actualScore = bowling.bowl(rolls);

        // then
        int expectedScore = 12;
        assertEquals(expectedScore, actualScore);
    }
}

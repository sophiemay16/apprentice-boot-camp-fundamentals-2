package bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    @Test
    public void gutterGame() {
        // given
        Bowling bowling = new Bowling();

        // when
        int[] rolls = new int[]{0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        int actualScore = bowling.bowl(rolls);

        // then
        int expectedScore = 0;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void scoreGame() {
        // given
        Bowling bowling = new Bowling();

        // when
        int[] rolls = new int[]{1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        int actualScore = bowling.bowl(rolls);

        // then
        int expectedScore = 20;
        assertEquals(expectedScore, actualScore);
    }
}

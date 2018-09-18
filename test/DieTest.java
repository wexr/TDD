import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    @Test
    void testRollMinValue() {

        // 3. arrange
        DieMinValue die = new DieMinValue();

        // 2. act
        die.roll();

        // 1. assert
        assertTrue(die.wasRolled);
        assertEquals(1, die.getFaceValue());
    }

    private class DieMinValue extends Die {
        boolean wasRolled = false;

        @Override
        public void roll(){
            super.roll();
            wasRolled = true;
        }

        @Override
        protected double mathRandom() {
            return 0;
        }
    }

    @Test
    void testRollMaxValue() {

        // 3. arrange
        DieMaxValue die = new DieMaxValue();

        // 2. act
        die.roll();

        // 1. assert
        assertTrue(die.wasRolled);
        assertEquals(6, die.getFaceValue());
    }

    private class DieMaxValue extends Die {
        boolean wasRolled = false;

        @Override
        public void roll(){
            super.roll();
            wasRolled = true;
        }

        @Override
        protected double mathRandom() {
            return 0.99;
        }
    }

    @Test
    void testMinValueEquals1() {

        //1. assert
        Die die = new Die();
        assertEquals(1, die.getMinValue());
    }

    @Test
    void testMaxValueEquals6() {

        //1. assert
        Die die = new Die();
        assertEquals(6, die.getMaxValue());
    }
}

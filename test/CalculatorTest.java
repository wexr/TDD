import org.junit.jupiter.api.Test;

import javax.xml.datatype.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testTwoPlusThreeEqualsFive() {
        //a = 2, b = 3 => result = 5

        //3. Arrange/set-up ( Hvilke variabler/instantieringer skal vi bruge til vores metode.)
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        //2. Act/Execution (Hvilke metode skal der bruges for at få vores resultat)
        int result = calculator.add(a,b);

        //1. Assert/Verification ( Hvilket resultat vil vi gerne have )
        // Hvad skal der ske
        assertEquals(5, result);

        //4. Clean-up

    }

    @Test
    void testFourPlusFiveEqualsIsNine() {
        //a = 2, b = 3 => result = 5

        //3. Arrange/set-up
        int a = 4;
        int b = 5;
        Calculator calculator = new Calculator();

        //2. Act/Execution
        int result = calculator.add(a,b);

        //1. Assert/Verification
        // Hvad skal der ske
        assertEquals(9, result);

        //4. Clean-up

    }

    @Test
    void test5Minus3Equals2() {

        //arrange
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        // act
        int result = calculator.subtract(a,b);
        //1. assert
        assertEquals(2, result);
    }

    @Test
    void testThreeMinusTwoEqualsOne() {

        //3. arrange
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;
        //2.  act
        int result = calculator.subtract(a,b);
        //1. assert
        assertEquals(1, result);

    }
}
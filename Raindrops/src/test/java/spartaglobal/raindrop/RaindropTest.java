package spartaglobal.raindrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaindropTest {

    // Simple test for numbers that have factors of 3, and not 5 or 7
    @Test
    public void factorOfThree() {
        int input = 3;
        String expectedResult = "Pling";
        String actualResult = Raindrop.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Simple test for numbers that have factors of 5, and not 3 or 7
    @Test
    public void factorOfFive() {
        int input = 5;
        String expectedResult = "Plang";
        String actualResult = Raindrop.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Simple test for numbers that have factors of 7, and not 3 or 5
    @Test
    public void factorOfSeven() {
        int input = 7;
        String expectedResult = "Plong";
        String actualResult = Raindrop.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Simple test for numbers that do not have factors of 3, 5 or 7
    @Test
    public void noSpecifiedFactors() {
        int input = 4;
        String expectedResult = "4";
        String actualResult = Raindrop.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    
}

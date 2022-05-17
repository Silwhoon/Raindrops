package spartaglobal.raindrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

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

    // Test for numbers that have two or more of the desired factors (3, 5 or 7)
    @ParameterizedTest
    @MethodSource("multipleSpecifiedFactorsData")
    public void multipleSpecifiedFactors(int input, String expectedResult) {
        String actualResult = Raindrop.convertNumber(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> multipleSpecifiedFactorsData() {
        return Stream.of(
                arguments(15, "PlingPlang"),
                arguments(21, "PlingPlong"),
                arguments(35, "PlangPlong"),
                arguments(105, "PlingPlangPlong")
        );
    }
    
}

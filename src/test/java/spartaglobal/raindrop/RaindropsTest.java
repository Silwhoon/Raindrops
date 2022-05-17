package spartaglobal.raindrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RaindropsTest {

    // Simple test for numbers that have factors of 3, and not 5 or 7
    @ParameterizedTest
    @ValueSource(ints = {3, -3, 12, -57})
    public void factorOfThree(int input) {
        String expectedResult = "Pling";
        String actualResult = Raindrops.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Simple test for numbers that have factors of 5, and not 3 or 7
    @ParameterizedTest
    @ValueSource(ints = {5, -5, 20, -80})
    public void factorOfFive(int input) {
        String expectedResult = "Plang";
        String actualResult = Raindrops.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Simple test for numbers that have factors of 7, and not 3 or 5
    @ParameterizedTest
    @ValueSource(ints = {7, -7, 28, -77})
    public void factorOfSeven(int input) {
        String expectedResult = "Plong";
        String actualResult = Raindrops.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Simple test for numbers that do not have factors of 3, 5 or 7
    @Test
    public void noSpecifiedFactors() {
        int input = 4;
        String expectedResult = "4";
        String actualResult = Raindrops.convertNumber(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Test for numbers that have two or more of the desired factors (3, 5 or 7)
    @ParameterizedTest
    @MethodSource("multipleSpecifiedFactorsData")
    public void multipleSpecifiedFactors(int input, String expectedResult) {
        String actualResult = Raindrops.convertNumber(input);
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

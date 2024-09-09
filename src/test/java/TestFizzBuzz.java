
import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestFizzBuzz {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setUp() {
        sut = new FizzBuzzExecutor();
    }

    @Test
    public void executeWithValidIntTest(){

        // Act
        var testValue = sut.execute(60);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }

    @Test
    public void checkIfFizzWorksTest() {
        int[] testNumbers = {3, 6, 9, 12, 18};


        for (int testNumber : testNumbers) {
            var testValue = sut.execute(testNumber);
            Assertions.assertEquals("Fizz", testValue);
        }
    }

    @Test
    public void checkIfBuzzWorksTest() {
        int[] testNumbers = {5, 10, 20, 25};

        for (int testNumber : testNumbers) {
            var testValue = sut.execute(testNumber);
            Assertions.assertEquals("Buzz", testValue);
        }
    }

    @Test
    public void checkIfFizzBuzzWorksTest() {
        int[] testNumbers = {15, 30, 45, 60};

        for (int testNumber : testNumbers) {
            var testValue = sut.execute(testNumber);
            Assertions.assertEquals("FizzBuzz", testValue);
        }
    }
}

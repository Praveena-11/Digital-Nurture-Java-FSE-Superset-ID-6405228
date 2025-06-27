import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class Exercise_4_AAA_Pattern_JUnit {

    private Calculator calculator;

    // Setup method: runs before each test
    @Before

    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator initialized");
    }

    // Teardown method: runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator cleaned up");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}

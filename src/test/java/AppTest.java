import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMainMethod() {
        // Assuming App has a method to get a welcome message
        String expected = "Welcome to the Week 9 Application!";
        String actual = App.getWelcomeMessage(); // Replace with actual method call
        assertEquals(expected, actual);
    }
}
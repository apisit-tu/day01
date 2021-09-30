import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    @DisplayName("เรากำลังทดสอบด้วย junit 5")
    public void case01() {
        // Arrange = Given
        Hello hello = new Hello();
        // Act = When
        String result = hello.say("apisit");
        // Assert = Then
        assertEquals("Hello apisit", result);
    }
}

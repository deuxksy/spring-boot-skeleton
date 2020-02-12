/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.spring.boot.skeleton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals(classUnderTest.getGreeting(), "Hello world");
    }
}

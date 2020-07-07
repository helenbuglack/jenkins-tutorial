import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTutorialJenkinsTest {

    private MainTutorialJenkins tutorialJenkins;

    @BeforeEach
    public void setTutorialJenkins() {
        this.tutorialJenkins = new MainTutorialJenkins();
    }

    @DisplayName("Run MainTutorialJenkins with number=-3")
    @Test
    public void testNegativeNumber() {

        String result = tutorialJenkins.run(-3);
        Assertions.assertEquals( ":D", result);
    }

    @DisplayName("Run MainTutorialJenkins with number=2")
    @Test
    public void testEvenNumber() {

        String result = tutorialJenkins.run(2);
        Assertions.assertEquals("Hello, my friend!", result);
    }

    @DisplayName("Run MainTutorialJenkins with number=3")
    @Test
    public void testUnevenNumber() {

        String result = tutorialJenkins.run(3);
        Assertions.assertEquals( "Goodbye, my friend!", result);
    }
}

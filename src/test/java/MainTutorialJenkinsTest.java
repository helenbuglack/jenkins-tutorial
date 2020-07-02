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
        Assertions.assertEquals(result, ":D");
    }

    @DisplayName("Run MainTutorialJenkins with number=2")
    @Test
    public void testEvenNumber() {

        String result = tutorialJenkins.run(2);
        Assertions.assertEquals(result, "Hello, my friend!");
    }

    @DisplayName("Run MainTutorialJenkins with number=3")
    @Test
    public void testUnevenNumber() {

        String result = tutorialJenkins.run(3);
        Assertions.assertEquals(result, "Goodbye, my friend!");
    }
}

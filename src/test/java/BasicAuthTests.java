import PagesSteps.BasicAuthPageSteps;
import org.junit.Test;

public class BasicAuthTests {
    BasicAuthPageSteps basicAuthPageSteps = new BasicAuthPageSteps();

    @Test
    public void openBasicAuthPageWithCred() {
        basicAuthPageSteps.openBasicAuthPageWithCred();
    }

    @Test
    public void openBasicAuthPageWithSetuppedCred() {
        basicAuthPageSteps.openBasicAuthPageWithSetuppedCred();
    }
}

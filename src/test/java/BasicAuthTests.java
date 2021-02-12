import PagesSteps.BasicAuthPageSteps;
import org.junit.Test;

public class BasicAuthTests {
    BasicAuthPageSteps basicAuthPageSteps = new BasicAuthPageSteps();

    @Test
    public void openBasicAuthPageWithCred() {
        basicAuthPageSteps.openBAPageUsingBasicAuth();
        basicAuthPageSteps.checkBasicAuthPageIsOpen();
    }

    @Test
    public void openBasicAuthPageWithSetuppedCred() {
        basicAuthPageSteps.openBAPageWithoutCred();
        basicAuthPageSteps.checkBasicAuthPageIsOpen();
    }
}

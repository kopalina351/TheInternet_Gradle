import PagesSteps.BasicAuthPageSteps;
import org.junit.Test;

public class BasicAuthTests {
    private final String urlBasicAuthWithCred = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    private final String urlBasicAuthWithoutCred = "https://the-internet.herokuapp.com/basic_auth";
    private final String titleBasicAuth = "Basic Auth";

    BasicAuthPageSteps basicAuthPageSteps = new BasicAuthPageSteps() {
        @Override
        public String getUrl() {
            return urlBasicAuthWithCred;
        }
    };

    @Test
    public void openBasicAuthPageWithCred() {
        basicAuthPageSteps.openBasicAuthPageWithCred();
        basicAuthPageSteps.checkBasicAuthPageIsOpen(titleBasicAuth);
    }

    @Test
    public void openBasicAuthPageWithSetuppedCred() {
        basicAuthPageSteps.openBasicAuthPageWithSetuppedCred();
    }
}

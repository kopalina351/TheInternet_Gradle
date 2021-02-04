package PagesSteps;

import Pages.BasicAuthPage;

import static com.codeborne.selenide.Selenide.open;

public class BasicAuthPageSteps {
    BasicAuthPage basicAuthPage = new BasicAuthPage();

    public void openBasicAuthPageWithCred(){
        open(basicAuthPage.urlBasicAuthWithCred);
        assert (basicAuthPage.pageTitle.getText()).equals(basicAuthPage.titleBasicAuth);
    }
    public void openBasicAuthPageWithSetuppedCred(){
        open(basicAuthPage.urlBasicAuthWithoutCred);
        assert (basicAuthPage.pageTitle.getText()).equals(basicAuthPage.titleBasicAuth);
    }
}

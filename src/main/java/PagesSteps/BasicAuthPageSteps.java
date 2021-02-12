package PagesSteps;

import Pages.BasicAuthPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BasicAuthPageSteps{
    BasicAuthPage basicAuthPage = new BasicAuthPage();

    public void openBAPageUsingBasicAuth(){
        open(basicAuthPage.getUrl());
    }

    public void checkBasicAuthPageIsOpen() {
        assertThat(basicAuthPage.getPageTitleElement().getText(), is(basicAuthPage.getTitlePage()));
    }
    public void openBAPageWithoutCred(){
        open(basicAuthPage.setUrl());
    }
}

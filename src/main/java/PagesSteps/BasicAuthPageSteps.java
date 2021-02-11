package PagesSteps;

import Base.AbstractBaseClase;
import Pages.BasicAuthPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public abstract class BasicAuthPageSteps extends AbstractBaseClase {
    BasicAuthPage basicAuthPage = new BasicAuthPage();
    public abstract String getUrl();

    public void openBasicAuthPageWithCred(){
        open(getUrl());
    }

    public void checkBasicAuthPageIsOpen(String titlePage) {
        assertThat(basicAuthPage.getPageTitle().getText(), is(titlePage));
    }
    public void openBasicAuthPageWithSetuppedCred(){
        open(getUrl());
    }
}

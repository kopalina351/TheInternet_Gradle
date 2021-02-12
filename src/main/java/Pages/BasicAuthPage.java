package Pages;

import Base.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage extends AbstractPage {
    private SelenideElement pageTitleElement = $(By.xpath("//h3[contains(text(),'Basic Auth')]"));

    private final String urlBasicAuthWithCred = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    private final String urlBasicAuthWithoutCred = "http://the-internet.herokuapp.com/basic_auth";
    private final String titleBasicAuth = "Basic Auth";

    public SelenideElement getPageTitleElement() {
        return pageTitleElement;
    }

    @Override
    public String getUrl() {
        return urlBasicAuthWithCred;
    }

    @Override
    public String getTitlePage() {
        return titleBasicAuth;
    }
    public String setUrl(){
        return urlBasicAuthWithoutCred;
    }
}

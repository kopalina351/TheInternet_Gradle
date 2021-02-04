package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage {
    public String urlBasicAuthWithCred = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    public String urlBasicAuthWithoutCred = "https://the-internet.herokuapp.com/basic_auth";
    public String titleBasicAuth = "Basic Auth";
    public SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'Basic Auth')]"));
}

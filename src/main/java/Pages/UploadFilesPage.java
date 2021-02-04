package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadFilesPage {
    public String urlName = "https://the-internet.herokuapp.com/upload";
    public String titlePage = "File Uploader";
    public SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'File Uploader')]"));
    public String path = "D:\\Automation\\MyProject\\src\\main\\resources\\";
    public String fileName = "Test1.txt";
    public SelenideElement fileUploadButton = $("#file-upload");
    public SelenideElement fileSubmitButton = $("#file-submit");
    public SelenideElement uploadedFiles = $("#uploaded-files");
}

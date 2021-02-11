package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadFilesPage {
    private SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'File Uploader')]"));
    private SelenideElement fileUploadButton = $("#file-upload");
    private SelenideElement fileSubmitButton = $("#file-submit");
    private SelenideElement uploadedFiles = $("#uploaded-files");

    public SelenideElement getPageTitle() {
        return pageTitle;
    }

    public SelenideElement getFileUploadButton() {
        return fileUploadButton;
    }

    public SelenideElement getFileSubmitButton() {
        return fileSubmitButton;
    }

    public SelenideElement getUploadedFiles() {
        return uploadedFiles;
    }

}

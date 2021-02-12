package Pages;

import Base.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadFilesPage extends AbstractPage {
    private SelenideElement pageTitleElement = $(By.xpath("//h3[contains(text(),'File Uploader')]"));
    private SelenideElement fileUploadButton = $("#file-upload");
    private SelenideElement fileSubmitButton = $("#file-submit");
    private SelenideElement uploadedFiles = $("#uploaded-files");

    private final String urlUploadFilesPage = "https://the-internet.herokuapp.com/upload";
    private final String titlePage = "File Uploader";

    public SelenideElement getPageTitleElement() {
        return pageTitleElement;
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

    @Override
    public String getUrl() {
        return urlUploadFilesPage;
    }

    @Override
    public String getTitlePage() {
        return titlePage;
    }
}

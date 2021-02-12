package PagesSteps;

import Pages.UploadFilesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UploadFilesSteps {
    UploadFilesPage uploadFilesPage = new UploadFilesPage();

    public void openUploadFilesPage() {
        open(uploadFilesPage.getUrl());
    }

    public void checkUploadFilesPageIsOpen() {
        assertThat (uploadFilesPage.getPageTitleElement().getText(),is(uploadFilesPage.getTitlePage()));
    }

    public void uploadFileFromPath(String path, String fileName) {
        uploadFilesPage.getFileUploadButton().sendKeys(path + fileName);
        uploadFilesPage.getFileSubmitButton().click();
    }

    public void checkThatFileIsUploaded(String fileName) {
        assertThat (uploadFilesPage.getUploadedFiles().getText(),is(equalTo(fileName)));
    }
}

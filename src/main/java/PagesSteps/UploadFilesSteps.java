package PagesSteps;

import Base.AbstractBaseClase;
import Pages.UploadFilesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public abstract class UploadFilesSteps extends AbstractBaseClase {
    UploadFilesPage uploadFilesPage = new UploadFilesPage();
    public abstract String getUrl();

    public void openUploadFilesPage() {
        open(getUrl());
    }

    public void checkUploadFilesPageIsOpen(String titlePage) {
        assertThat (uploadFilesPage.getPageTitle().getText(),is(titlePage));
    }

    public void uploadFileFromPath(String path, String fileName) {
        uploadFilesPage.getFileUploadButton().sendKeys(path + fileName);
        uploadFilesPage.getFileSubmitButton().click();
    }

    public void checkThatFileIsUploaded(String fileName) {
        assertThat (uploadFilesPage.getUploadedFiles().getText(),is(equalTo(fileName)));
    }
}

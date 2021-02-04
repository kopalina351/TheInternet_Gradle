package PagesSteps;

import Pages.UploadFilesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UploadFilesSteps {
    UploadFilesPage uploadFilesPage = new UploadFilesPage();

    public void openUploadFilesPage() {
        open(uploadFilesPage.urlName);
        assert (uploadFilesPage.pageTitle.getText().equals(uploadFilesPage.titlePage));
    }

    public void uploadFileFromPath(String path, String fileName) {
        uploadFilesPage.fileUploadButton.sendKeys(uploadFilesPage.path + uploadFilesPage.fileName);
        uploadFilesPage.fileSubmitButton.click();
    }

    public void checkThatFileIsUploaded() {
        assertThat (uploadFilesPage.uploadedFiles.getText(),is(equalTo(uploadFilesPage.fileName)));
    }
}

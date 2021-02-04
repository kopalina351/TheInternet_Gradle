import Pages.UploadFilesPage;
import PagesSteps.UploadFilesSteps;
import org.junit.Test;

public class UploadFilesTests {
    UploadFilesPage uploadFilesPage = new UploadFilesPage();
    UploadFilesSteps uploadFilesSteps = new UploadFilesSteps();

    @Test
    public void fileUpload(){
        uploadFilesSteps.openUploadFilesPage();
        uploadFilesSteps.uploadFileFromPath(uploadFilesPage.path, uploadFilesPage.fileName);
        uploadFilesSteps.checkThatFileIsUploaded();
    }
}

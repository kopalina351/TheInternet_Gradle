import PagesSteps.UploadFilesSteps;
import org.junit.Test;

public class UploadFilesTests {
    private final String titlePage = "File Uploader";
    private final String path = "D:\\Automation\\MyProject\\src\\main\\resources\\";
    private final String fileName = "Test1.txt";

    UploadFilesSteps uploadFilesSteps = new UploadFilesSteps() {

        @Override
        public String getUrl() {
            return "https://the-internet.herokuapp.com/upload";
        }
    };

    @Test
    public void fileUpload() {
        uploadFilesSteps.openUploadFilesPage();
        uploadFilesSteps.checkUploadFilesPageIsOpen(titlePage);
        uploadFilesSteps.uploadFileFromPath(path, fileName);
        uploadFilesSteps.checkThatFileIsUploaded(fileName);
    }
}

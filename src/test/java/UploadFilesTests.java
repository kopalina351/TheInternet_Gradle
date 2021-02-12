import PagesSteps.UploadFilesSteps;
import org.junit.Test;

public class UploadFilesTests {

    private final String path = "D:\\Automation\\MyProject\\src\\main\\resources\\";
    private final String fileName = "Test1.txt";

    UploadFilesSteps uploadFilesSteps = new UploadFilesSteps();

    @Test
    public void fileUpload() {
        uploadFilesSteps.openUploadFilesPage();
        uploadFilesSteps.checkUploadFilesPageIsOpen();
        uploadFilesSteps.uploadFileFromPath(path, fileName);
        uploadFilesSteps.checkThatFileIsUploaded(fileName);
    }
}
